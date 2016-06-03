package az.qutan.web;

import az.qutan.data.Mail;
import static az.qutan.data.SubscriberDB.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vrom911
 */
public class SubscribeServlet extends HttpServlet {

    /**
     * Subscribe to weekly newsletter from Qutan team. Need only email for data base(at this point)
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
        String to = request.getParameter("email");
        if (to != null && !to.isEmpty()) {
            if (insertSubscriber(to) == 1) {
//                status 1 means - new user not in the db
//                send him thanks for subscribing
//                status -1 - user already subscribed and status active
//                status 0 - this is not normal, some mistake
                try {
                Mail.sendMail(to, "Subscribe Successful", Mail.generateSubscriber(), true);
            } catch (MessagingException ex) {
                Logger.getLogger(SubscribeServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

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
