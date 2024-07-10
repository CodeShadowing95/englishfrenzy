package com.estiam.englishapp.dao;

import com.estiam.englishapp.pojos.Joueur;
import com.estiam.englishapp.pojos.Partie;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class PartieDao extends Dao {
  public Partie findById(Long id) {
    Partie partie = null;

    try {
      session = openSession();
      partie = (Partie)session.get(Partie.class, id);
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return partie;
  }

  public Partie findByJoueur(Joueur joueur) {
    Partie partie = null;

    try {
      session = openSession();
      Query<Partie> query = session.createQuery("select p from Partie p where p.joueur = :joueur", Partie.class);
      query.setParameter("joueur", joueur);
      partie = query.getSingleResult();
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return partie;
  }

  public List<Partie> findAll() {
    List<Partie> parties = null;

    try {
      session = openSession();
      Query<Partie> query = session.createQuery("select p from Partie p", Partie.class);
      parties = query.getResultList();
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return parties;
  }

  public Partie create(Partie partie) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.persist(partie);
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }

    return partie;
  }

  public Partie update(Partie partie) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.merge(partie);
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }

    return partie;
  }

  public void delete(Partie partie) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.remove(partie);
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }
  }

  @SuppressWarnings("deprecation")
  public void deleteAll() {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.createQuery("delete from Partie").executeUpdate();
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }
  }
}
