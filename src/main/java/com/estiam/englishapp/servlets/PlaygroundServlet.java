package com.estiam.englishapp.servlets;

import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Partie;
import com.estiam.englishapp.pojos.Question;
import com.estiam.englishapp.pojos.Verbe;
import com.estiam.englishapp.services.PartieService;
import com.estiam.englishapp.services.QuestionService;
import com.estiam.englishapp.services.VerbeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

@WebServlet(name = "playgroundServlet", urlPatterns = { "/playground" })
public class PlaygroundServlet extends HttpServlet {
  private Boolean isWrongAnswer = false;

  private Partie currentPartie = new Partie();

  private final List<Verbe> tempVerbes = new VerbeService().getVerbes();
  private final List<Verbe> allVerbes = new VerbeService().getVerbes();
  private int length = allVerbes.size();

  private Verbe currentVerbe;

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    // On récupère le joueur en session
    HttpSession session = request.getSession();
    Joueur joueur = (Joueur) session.getAttribute("joueur");

    if (joueur == null) {
      response.sendRedirect("connexion");
    } else {
      QuestionService questionService = new QuestionService();
      System.out.println("Questions: " + questionService.getQuestions().size());
      System.out.println("Verbes restants: " + tempVerbes.size());

      List<Question> questions = questionService.getQuestions();
      // On teste s'il y a des questions en bd
      if (!questions.isEmpty()) {
        // On affiche la progression
        request.setAttribute("progression", questions.size());
      } else {
        // On initialise la progression
        request.setAttribute("progression", 0);
      }

      setCurrentVerbe(tempVerbes.get((int) (Math.random() * tempVerbes.size())));
      Partie p = new PartieService().getPartieByJoueur(joueur);
      setCurrentPartie(p);

      request.setAttribute("currentVerbe", currentVerbe);
    }

    // On affiche la vue
    this.getServletContext().getRequestDispatcher("/WEB-INF/playground.jsp").forward(request, response);
  }


  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    QuestionService questionService = new QuestionService();
    Question currentQuestion = new Question();

    // On affiche le verbe courant
    Verbe v = this.getCurrentVerbe();

    currentQuestion.setDateEnvoi(new Timestamp(System.currentTimeMillis()));

    String participePasse = request.getParameter("participePasse");
    String preterit = request.getParameter("preterit");

    // On teste et affiche les erreurs
    String erreurs = "";
    if (participePasse.isEmpty()) {
      erreurs += "Le champ participe passe est obligatoire<br/>";
    }
    if (preterit.isEmpty()) {
      erreurs += "Le champ preterit est obligatoire<br/>";
    }

    if (erreurs.isEmpty()) {
      if (v.getParticipePasse().equals(participePasse) && v.getPreterit().equals(preterit)) {
        setWrongAnswer(false);

        // On enregistre la question trouvée
        currentQuestion.setReponseParticipePasse(participePasse);
        currentQuestion.setReponsePreterit(preterit);
        currentQuestion.setDateReponse(new Timestamp(System.currentTimeMillis()));
        currentQuestion.setPartie(currentPartie);
        currentQuestion.setVerbe(v);
        questionService.addQuestion(currentQuestion);

        // On retire le verbe de la liste des verbes restants
        tempVerbes.remove(v);

        // Si toutes les questions ont été trouvés, on affiche la vue de fin de partie
        List<Question> questions = questionService.getQuestions();
        if (questions.size() == length) {
          this.getServletContext().getRequestDispatcher("/WEB-INF/success.jsp").forward(request, response);
        } else {
          response.sendRedirect("playground");
        }
      } else {
        setWrongAnswer(true);
        HttpSession session = request.getSession();
        QuestionService qs = new QuestionService();
        qs.deleteAllQuestions();
        session.setAttribute("currentVerbe", v);

        // On réinitialise tous les verbes
        tempVerbes.clear();
        tempVerbes.addAll(new VerbeService().getVerbes());

        response.sendRedirect("failure");
      }
    }
  }

  public Boolean getWrongAnswer() {
    return isWrongAnswer;
  }

  public void setWrongAnswer(Boolean wrongAnswer) {
    isWrongAnswer = wrongAnswer;
  }

  public Verbe getCurrentVerbe() {
    return currentVerbe;
  }

  public void setCurrentVerbe(Verbe currentVerbe) {
    this.currentVerbe = currentVerbe;
  }

  public Partie getCurrentPartie() {
    return currentPartie;
  }

  public void setCurrentPartie(Partie currentPartie) {
    this.currentPartie = currentPartie;
  }
}
