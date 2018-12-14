package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = false;
        User thisUser = DaoFactory.getUserDao().findByUsername(username);
        boolean isItAUser = thisUser.getUsername() == null;
        boolean isPasswordCorrect = thisUser.getPassword().equals(password);
        if (!isItAUser && isPasswordCorrect){
            validAttempt = true;
        }
        if (validAttempt) {
            request.getSession().setAttribute("user", thisUser.getUsername());
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
