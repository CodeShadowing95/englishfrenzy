package com.estiam.englishapp.services;

import com.estiam.englishapp.dao.VerbeDao;
import com.estiam.englishapp.pojos.Verbe;

import java.util.List;

public class VerbeService {
    private VerbeDao verbeDao = new VerbeDao();

    public Verbe addVerbe(Verbe verbe) {
      return verbeDao.create(verbe);
    }

    public Verbe updateVerbe(Verbe verbe) {
      return verbeDao.update(verbe);
    }

    public void deleteVerbe(Verbe verbe) {
      verbeDao.delete(verbe);
    }

    public Verbe getVerbe(Long id) {
      return verbeDao.findById(id);
    }

    public Verbe getVerbeByBaseVerbale(Verbe baseVerbale) {
      return verbeDao.findByBaseVerbale(baseVerbale);
    }

    public List<Verbe> getVerbes() {
      return verbeDao.findAll();
    }
}
