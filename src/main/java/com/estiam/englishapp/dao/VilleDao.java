package com.estiam.englishapp.dao;

import com.estiam.englishapp.pojos.Ville;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class VilleDao extends Dao{
  public Ville findById(Long id) {
    Ville ville = null;

    try {
      session = openSession();
      ville = (Ville)session.get(Ville.class, id);
    } catch (Exception ex) {
      throw ex;
    } finally {
      closeSession();
    }

    return ville;
  }

  public Ville findByName(String name) {
    Ville ville = null;

    try {
      session = openSession();
      Query<Ville> query = session.createQuery("select v from Ville v where v.nom = :nom", Ville.class);
      query.setParameter("nom", name);
      ville = query.getSingleResult();
    } catch (Exception ex) {
      throw ex;
    } finally {
      closeSession();
    }

    return ville;
  }

  public List<Ville> findAll() {
    List<Ville> villes = null;

    try {
      session = openSession();
      Query<Ville> query = session.createQuery("select v from Ville v", Ville.class);

      villes = query.getResultList();
    } catch (Exception ex) {
      throw ex;
    } finally {
      closeSession();
    }
    return villes;
  }

  public Ville create(Ville ville) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.persist(ville);
      transaction.commit();
    } catch (Exception ex) {
      if (transaction != null) {
        transaction.rollback();
      }
      throw ex;
    } finally {
      closeSession();
    }

    return ville;
  }

  public Ville update(Ville ville) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.merge(ville);
      transaction.commit();
    } catch (Exception ex) {
      if (transaction != null) {
        transaction.rollback();
      }
      throw ex;
    } finally {
      closeSession();
    }

    return ville;
  }

  public void delete(Ville ville) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.remove(ville);
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
