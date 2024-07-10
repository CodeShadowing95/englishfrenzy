package com.estiam.englishapp.services;



import com.estiam.englishapp.dao.JoueurDao;
import com.estiam.englishapp.pojos.Joueur;

import java.util.List;

public class JoueurService {
    
    private JoueurDao joueurDao = new JoueurDao();
    
    public Joueur addJoueur(Joueur joueur) {
        return joueurDao.create(joueur);
    }

    public Joueur updateJoueur(Joueur joueur) {
        return joueurDao.update(joueur);
    }

    public void deleteJoueur(Joueur joueur) {
        joueurDao.delete(joueur);
    }

    public Joueur getJoueur(Long id) {
      return joueurDao.findById(id);
    }

    public Joueur getJoueurByEmail(String email) {
      return joueurDao.findByEmail(email);
    }

    public List<Joueur> getJoueurs() {
      return joueurDao.findAll();
    }
}
