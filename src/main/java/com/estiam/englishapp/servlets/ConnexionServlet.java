package com.estiam.englishapp.servlets;

import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Partie;
import com.estiam.englishapp.pojos.Ville;
import com.estiam.englishapp.services.JoueurService;
import com.estiam.englishapp.services.PartieService;
import com.estiam.englishapp.services.QuestionService;
import com.estiam.englishapp.services.VilleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "connexionServlet", urlPatterns = { "/connexion" })
public class ConnexionServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    // charge la vue
    this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    // récupère la session
    HttpSession session = request.getSession();

    // crée les services
    JoueurService joueurService = new JoueurService();
    PartieService partieService = new PartieService();
    QuestionService questionService = new QuestionService();

    // on vide les tables pour commencer une nouvelle partie
    questionService.deleteAllQuestions();
    partieService.deleteAllParties();

    // récupère les paramètres
    String email = request.getParameter("email");
    String password = request.getParameter("password");

    String erreurs = "";

    if (email.isEmpty() || password.isEmpty()) {
      erreurs += "Email ou mot de passe non renseigné !";
    }

    if (erreurs.isEmpty()) {
      Joueur joueur = joueurService.getJoueurByEmail(email);

      if (joueur != null) {

        if (joueur.getMotDePasse().equals(password)) {
          // enregistre le membre dans la session
          session.setAttribute("joueur", joueur);

          // on enregistre le membre dans une nouvelle partie
          Partie partie = new Partie();
          partie.setJoueur(joueur);
          partieService.addPartie(joueur);

          VilleService villeService = new VilleService();
          Ville ville = villeService.getVille(joueur.getVille().getId());
          session.setAttribute("ville", ville.getNom());

          // redirige vers la page confirmation
          response.sendRedirect("confirmation");
        } else {
          erreurs += "Email ou mot de passe incorrect !";
        }
      } else {
        erreurs += "Email ou mot de passe incorrect !";
      }
    }

    if (!erreurs.isEmpty()) {

      request.setAttribute("erreurs", erreurs);

      this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
    }
  }
}
