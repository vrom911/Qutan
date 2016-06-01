/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.qutan.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vrom911
 */
public class RegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
                1.read registration data from form
                2.validate data
                3.if valid register user
                4.else redirect to register page with user enter information
         */

        //1.read registration data from form
        String username = "";
        String password = "";
        String passwordConfirmation = "";
        String name = "";
        String surname = "";
        String email = "";
        boolean valid = true;

        if (request.getParameter("username") != null) {
            username = request.getParameter("username");
        }

        if (request.getParameter("password") != null) {
            password = request.getParameter("password");
        }

        if (request.getParameter("passwordConfirmation") != null) {
            passwordConfirmation = request.getParameter("passwordConfirmation");
        }

        if (request.getParameter("name") != null) {
            name = request.getParameter("name");
        }

        if (request.getParameter("surname") != null) {
            surname = request.getParameter("surname");
        }

        if (request.getParameter("email") != null) {
            email = request.getParameter("father_name");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
