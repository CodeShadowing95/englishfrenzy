package com.estiam.englishapp.dao;


import com.estiam.englishapp.pojos.Verbe;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class VerbeDao extends Dao {
  public Verbe findById(Long id) {
    Verbe verbe = null;

    try {
      session = openSession();
      verbe = session.get(Verbe.class, id);
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }
    
    return verbe;
  }

  public Verbe findByBaseVerbale(Verbe baseVerbale) {
    Verbe verbe = null;

    try {
      session = openSession();
      Query<Verbe> query = session.createQuery("select ve from Verbe ve where ve.baseVerbale = :baseVerbale", Verbe.class);
      query.setParameter("baseVerbale", baseVerbale);
      verbe = query.getSingleResult();
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }
    
    return verbe;
  }


  public List<Verbe> findAll() {
    List<Verbe> verbes = null;

    try {
      session = openSession();
      Query<Verbe> query = session.createQuery("select ve from Verbe ve", Verbe.class);

      verbes = query.getResultList();
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return verbes;
  }


  public Verbe create(Verbe verbe) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.persist(verbe);
      transaction.commit();
    } catch (Exception ex) {
      if (transaction != null) {
        transaction.rollback();
      }
      throw ex;
    } finally {
      closeSession();
    }

    return verbe;
  }


  public Verbe update(Verbe verbe) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.merge(verbe);
      transaction.commit();
    } catch (Exception ex) {
      if (transaction != null) {
        transaction.rollback();
      }
      throw ex;
    } finally {
      closeSession();
    }

    return verbe;
  }


  public void delete(Verbe verbe) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.remove(verbe);
      transaction.commit();
    } catch (Exception ex) {
      if (transaction != null) {
        transaction.rollback();
      }
      throw ex;
    } finally {
      closeSession();
    }
  }
}
