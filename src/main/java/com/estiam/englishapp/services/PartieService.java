package com.estiam.englishapp.services;



import com.estiam.englishapp.dao.PartieDao;
import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Partie;

import java.util.List;

public class PartieService {

  private PartieDao partieDao = new PartieDao();

  public Partie addPartie(Joueur joueur) {
    Partie partie = new Partie();
    partie.setJoueur(joueur);
    return partieDao.create(partie);
  }

  public Partie updatePartie(Partie partie) {
    return partieDao.update(partie);
  }

  public void deletePartie(Partie partie) {
    partieDao.delete(partie);
  }

  public Partie getPartie(Long id) {
    return partieDao.findById(id);
  }

  public Partie getPartieByJoueur(Joueur joueur) {
    return partieDao.findByJoueur(joueur);
  }

  public List<Partie> getParties() {
    return partieDao.findAll();
  }

  // Delete all parties
  public void deleteAllParties() {
    partieDao.deleteAll();
  }
}
