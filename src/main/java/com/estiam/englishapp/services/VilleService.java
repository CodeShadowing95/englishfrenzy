package com.estiam.englishapp.services;

import com.estiam.englishapp.dao.VilleDao;
import com.estiam.englishapp.pojos.Ville;

import java.util.List;

public class VilleService {
    private VilleDao villeDao = new VilleDao();

    public Ville addVille(Ville ville) {
      return villeDao.create(ville);
    }

    public Ville updateVille(Ville ville) {
      return villeDao.update(ville);
    }

    public void deleteVille(Ville ville) {
      villeDao.delete(ville);
    }

    public Ville getVille(Long id) {
      return villeDao.findById(id);
    }

    public Ville getVille(String name) {
      return villeDao.findByName(name);
    }

    public List<Ville> getVilles() {
      return villeDao.findAll();
    }
}
