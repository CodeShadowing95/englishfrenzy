package com.estiam.englishapp.dao;



import com.estiam.englishapp.pojos.Question;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class QuestionDao extends Dao {
  public Question findById(Long id) {
    Question question = null;

    try {
      session = openSession();
      question = (Question)session.get(Question.class, id);
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return question;
  }

  public List<Question> findAll() {
    List<Question> questions = null;

    try {
      session = openSession();
      Query<Question> query = session.createQuery("select q from Question q", Question.class);
      questions = query.getResultList();
    } catch (Exception e) {
      throw e;
    } finally {
      closeSession();
    }

    return questions;
  }

  public Question create(Question question) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.persist(question);
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }

    return question;
  }

  public Question update(Question question) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.merge(question);
      transaction.commit();
    } catch (Exception e) {
      if (transaction != null) {
        transaction.rollback();
      }

      throw e;
    } finally {
      closeSession();
    }

    return question;
  }

  public void delete(Question question) {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.remove(question);
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

  // truncate table
  @SuppressWarnings("deprecation")
  public void deleteAll() {
    Transaction transaction = null;

    try {
      session = openSession();
      transaction = session.beginTransaction();
      session.createQuery("delete from Question").executeUpdate();
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
