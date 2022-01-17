/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author calza
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "Result: ---");

        if (request.getParameter("first") != null && request.getParameter("second") != null) {
            try {
                String firstString = request.getParameter("first");
                int number1 = Integer.parseInt(firstString);
                String secondString = request.getParameter("second");
                int number2 = Integer.parseInt(secondString);

                String action = request.getParameter("action");
                int answer;

                if ("add".equals(action)) {
                    answer = number1 + number2;
                    request.setAttribute("message", "Result: " + answer);
                } else if ("sub".equals(action)) {
                    answer = number1 - number2;
                    request.setAttribute("message", "Result: " + answer);
                } else if ("mult".equals(action)) {
                    answer = number1 * number2;
                    request.setAttribute("message", "Result: " + answer);
                } else if ("rem".equals(action)) {
                    answer = number1 % number2;
                    request.setAttribute("visible", "hidden");
                    request.setAttribute("message", "Result: " + answer);
                }
                

            } catch (Exception ex) {
                request.setAttribute("messgae", "Result: Invalid");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
