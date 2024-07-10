package com.estiam.englishapp.servlets;

import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Partie;
import com.estiam.englishapp.pojos.Verbe;
import com.estiam.englishapp.services.PartieService;
import com.estiam.englishapp.services.QuestionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "failureServlet", urlPatterns = {"/failure"})
public class FailureServlet extends HttpServlet {

    private Verbe currentVerbe;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // On récupère le joueur en session
        HttpSession session = request.getSession();
        Joueur joueur = (Joueur) session.getAttribute("joueur");

        setCurrentVerbe((Verbe) session.getAttribute("currentVerbe"));
        // On affiche le verbe en cours
        request.setAttribute("currentVerbe", currentVerbe);

        // On réinitialise la partie et les questions en cours
        QuestionService questionService = new QuestionService();
        PartieService partieService = new PartieService();
        questionService.deleteAllQuestions();
        partieService.deleteAllParties();

        // On enregistre le joueur dans une nouvelle partie
        Partie partie = new Partie();
        partie.setJoueur(joueur);
        partieService.addPartie(joueur);

        if (joueur == null) {
            response.sendRedirect("connexion");
        } else {
            // charge la vue
            this.getServletContext().getRequestDispatcher("/WEB-INF/failure.jsp").forward(request, response);
        }
    }

    public Verbe getCurrentVerbe() {
        return currentVerbe;
    }

    public void setCurrentVerbe(Verbe currentVerbe) {
        this.currentVerbe = currentVerbe;
    }
}
