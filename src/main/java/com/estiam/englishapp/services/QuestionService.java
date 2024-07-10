package com.estiam.englishapp.services;



import com.estiam.englishapp.dao.QuestionDao;
import com.estiam.englishapp.pojos.Question;

import java.util.List;

public class QuestionService {

  private QuestionDao questionDao = new QuestionDao();

  public Question addQuestion(Question question) {
    return questionDao.create(question);
  }

  public Question updateQuestion(Question question) {
    return questionDao.update(question);
  }

  public void deleteQuestion(Question question) {
    questionDao.delete(question);
  }

  public Question getQuestion(Long id) {
    return questionDao.findById(id);
  }

  public List<Question> getQuestions() {
    return questionDao.findAll();
  }

  public void deleteAllQuestions() {
    questionDao.deleteAll();
  }
}
