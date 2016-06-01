package az.qutan.web;

import az.qutan.data.Mail;
import static az.qutan.data.MessageDB.*;
import az.qutan.model.Message;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vrom911
 */
public class ContactServlet extends HttpServlet {

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
        String email = "";
        String fullname = "";
        String phone = request.getParameter("phone");
        String text = "";
        int id = -1;
        String errorMessage = "";

         if (request.getParameter("email") != null) {
            email = request.getParameter("email");
        }
         if (request.getParameter("fullname") != null) {
            fullname = request.getParameter("fullname");
        }
         if (request.getParameter("text") != null) {
            text = request.getParameter("text");
        }
//        if (!email.isEmpty() && !fullname.isEmpty() && !text.isEmpty() ) {
            System.out.println("Yeap");
            Message message = new Message(fullname, email, phone, text, -1);
            id = insertMessage(message);
            System.out.println("id=" + id);
            if (id == -1) {
                errorMessage = "Ooups! Something went wrong, please, try again"; }
        try {
            //            here will be the part with the email sending
            Mail.sendMail(email, "Your Message received", Mail.generateMessage(fullname), true);
            updateMessageStatus(id, 0);
        } catch (MessagingException ex) {
            Logger.getLogger(ContactServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp#contact");
            dispatcher.forward(request, response);

//        }
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
