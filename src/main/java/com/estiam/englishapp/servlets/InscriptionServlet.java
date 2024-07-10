package com.estiam.englishapp.servlets;


import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Ville;
import com.estiam.englishapp.services.JoueurService;
import com.estiam.englishapp.services.VilleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "inscriptionServlet", urlPatterns = {"/inscription"})
public class InscriptionServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        // créer les services
        VilleService villeService = new VilleService();

        List<Ville> villes = villeService.getVilles();

        request.setAttribute("villes", villes);

        // charge la vue
        this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // récupère la session
        HttpSession session = request.getSession();

        // créer les services
        VilleService villeService = new VilleService();
        JoueurService joueurService = new JoueurService();

        String email = request.getParameter("email");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String motDePasse = request.getParameter("motDePasse");
        String confirmationPassword = request.getParameter("confirmationPassword");
        String ville = request.getParameter("ville");
        String niveau = "Débutant";


        // test si les champs sont bien renseignés et construit un message d'erreur
        String erreurs = "";

        if (nom.isEmpty()) {
            erreurs += "Le champ nom est obligatoire<br>";
        }

        if (prenom.isEmpty()) {
            erreurs += "Le champ prénom est obligatoire<br>";
        }

        if (email.isEmpty()) {
            erreurs += "Le champ email est obligatoire<br>";
        }

        if (motDePasse.isEmpty()) {
            erreurs += "Le champ motDePasse est obligatoire<br>";
        }

        if (!motDePasse.equals(confirmationPassword)) {
            erreurs += "Mots de passe non identiques<br>";
        }

        if (ville.isEmpty()) {
            erreurs += "Le champ ville est obligatoire<br>";
        }

        if (niveau.isEmpty()) {
            erreurs += "Le champ niveau est obligatoire<br>";
        }

        // si pas d'erreur
        if (erreurs.isEmpty()) {
          // crée un member
          Joueur joueur = new Joueur();

          joueur.setNom(nom);
          joueur.setPrenom(prenom);
          joueur.setEmail(email);
          joueur.setMotDePasse(motDePasse);
          joueur.setNiveau(niveau);
          joueur.setVille(villeService.getVille(ville));

          // enregistre le member en base de données
          joueurService.addJoueur(joueur);

          // enregistre le membre dans la session
          session.setAttribute("joueur", joueur);

          // redirige vers la page de confirmation
          response.sendRedirect("connexion");
        }
        else {
          // envoie la liste des villes à la jsp
          List<Ville> villes = villeService.getVilles();

          request.setAttribute("villes", villes);

          // envoie l'erreur à la jsp
          request.setAttribute("erreurs", erreurs);

          // renvoie les informations déjà saisies
          request.setAttribute("nom", nom);
          request.setAttribute("prenom", prenom);
          request.setAttribute("email", email);
          request.setAttribute("niveau", niveau);


          // sinon réaffiche le formulaire avec le message d'erreur
          this.getServletContext().getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
        }
    }
}
