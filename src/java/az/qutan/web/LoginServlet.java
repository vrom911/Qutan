package az.qutan.web;

import az.qutan.data.ConnectionPool;
import az.qutan.data.DBUtil;
import az.qutan.model.User;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.*;
/**
 *
 * @author vrom911
 */
public class LoginServlet extends HttpServlet {

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
        String username = "";
        String pwd = "";
        String nextUrl = "/login.jsp";
        boolean valid = true;
        if (request.getParameter("username") != null) {
            username = request.getParameter("username");
        }
        if (request.getParameter("pwd") != null) {
            pwd = request.getParameter("pwd");
        }
        if (username != null && !username.isEmpty()
                && pwd != null && !pwd.isEmpty()) {
            ConnectionPool pool = null;
            Connection con = null;
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            try {
                pool = ConnectionPool.getInstance();
                con = pool.getConnection();
                System.out.println("Database connection established");

                pstmt = con.prepareStatement("SELECT * FROM user WHERE username=? AND  password=?");
                pstmt.setString(1,username);
                pstmt.setString(2,pwd);

                rs = pstmt.executeQuery();
                if (rs.next()) {
                    int userId = rs.getInt("id");
                    System.out.println("login success user id = " + userId);
                    PreparedStatement updateLastVisit = con.prepareStatement("UPDATE user SET last_seen=curdate() where username=?");
                    updateLastVisit.setString(1, username);
                    updateLastVisit.executeUpdate();
                    User user = new User(userId, username, pwd, rs.getString("email"), rs.getString("phone"),rs.getDate("last_seen"), 0);
                    HttpSession session = request.getSession();
                    session.setAttribute("user", user);
//                    Cookie loginCookie = new Cookie("user",user.toString());
                    nextUrl = "/account.jsp";
//                    session.setAttribute("name",);

                } else {
                    System.out.println("Something wrong with login");
                    valid = false;
                }

            } catch (SQLException ex) {
                Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Hmm...");
            } finally {
                // Эта часть позволяет нам закрыть все открытые ресуры
                // В противном случае возмжожны проблемы. Поэтому будьте
                // всегда аккуратны при работе с коннектами
                    DBUtil.closeResultSet(rs);
                    DBUtil.closePreparedStatement(pstmt);
                    pool.freeConnection(con);
                    System.out.println("Database connection terminated");
//                HttpSession session = request.getSession();
//                session.setAttribute("username", username);
                getServletContext().getRequestDispatcher(nextUrl).forward(request, response);
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
