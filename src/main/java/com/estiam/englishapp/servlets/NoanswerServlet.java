package com.estiam.englishapp.servlets;

import com.estiam.englishapp.services.QuestionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "noanswerServlet", urlPatterns = {"/noanswer"})
public class NoanswerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionService questionService = new QuestionService();
        questionService.deleteAllQuestions();

        this.getServletContext().getRequestDispatcher("/WEB-INF/noanswer.jsp").forward(request, response);
    }
}
