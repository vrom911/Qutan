package az.qutan.web;

import az.qutan.data.PersonDB;
import az.qutan.data.UserDB;
import static az.qutan.data.UserDB.insertUser;
import az.qutan.model.City;
import az.qutan.model.Person;
import az.qutan.model.User;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordConfirmation = request.getParameter("passwordConfirmation");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String gender = request.getParameter("gender");
        Date birthday = null;
        int city = Integer.parseInt(request.getParameter("city"));
        try {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            birthday = format.parse(request.getParameter("birthday"));
        } catch (ParseException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

//        here will be all proper validation..don't have time now..

        User user = new User(-1, username, password, email, phone, new Date(), 0);
        int userId = insertUser(user);
        user.setId(userId);
        Person person = new Person(-1, name, surname, gender,city, birthday, new Date(), user, 0, 0 );
        int personId = PersonDB.insertPerson(person);

        boolean valid = true;

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
