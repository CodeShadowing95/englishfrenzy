package com.estiam.englishapp.servlets;

import com.estiam.englishapp.pojos.Joueur;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "confirmationServlet", urlPatterns = {"/confirmation"})
public class ConfirmationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // récupère dans la session le joueur
        HttpSession session = request.getSession();
        Joueur joueur = (Joueur) session.getAttribute("joueur");

        if (joueur == null) {
          response.sendRedirect("connexion");
          // this.getServletContext().getRequestDispatcher("/WEB-INF/connexion.jsp").forward(request, response);
        } else {
          // ajoute dans la request le membre et la partie pour afficher les informations dans la jsp
          request.setAttribute("joueur", joueur);
  
          // affiche la vue
          this.getServletContext().getRequestDispatcher("/WEB-INF/confirmation.jsp").forward(request, response);
        }
    }
}
