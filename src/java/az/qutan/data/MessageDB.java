package az.qutan.data;

import az.qutan.model.Message;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @version 1.0     May 31, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: MessageDB
 */
public class MessageDB {
    public static int insertMessage(Message message) {
        int id = -1;
        ConnectionPool pool = null;
        Connection connection = null;

        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "INSERT INTO message ( fullname, email, phone, message)"
                + "VALUES ( ?, ?, ?, ?)";
        try {
            pool = ConnectionPool.getInstance();
            connection = pool.getConnection();
            System.out.println("Database connection established");
            ps = connection.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, message.getFullname());
            ps.setString(2, message.getEmail());
            ps.setString(3, message.getPhone());
            ps.setString(4, message.getText());
            System.out.println("Before");
            ps.executeUpdate();
            System.out.println("After");
            rs = ps.getGeneratedKeys();
        if (rs.next()){
            id = rs.getInt(1);
        }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            id = -1;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
            System.out.println("Database connection terminated");
        }
        return id;
    }
    public static void updateMessageStatus(int id, int status) {
//        -1 - default/not responsed
//        0 - first response was sent
//        1 - problem solved - final response
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "UPDATE message SET response_status=?"
                + " WHERE id=?";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, status);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println(" success: added row");
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("errror: smth went wrong");
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
