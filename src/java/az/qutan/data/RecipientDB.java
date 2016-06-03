package az.qutan.data;

import az.qutan.model.Recipient;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: RecipientDB
 */
public class RecipientDB {
    public static void insertRecipient(Recipient recipient) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "INSERT INTO recipient (username, password, email, phone, last_seen, status )"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query);
//            ps.setString(1, recipient.getUsername());
//            ps.setString(2, recipient.getPwd());
//            ps.setString(3, recipient.getEmail());
//            ps.setString(4, recipient.getPhone());
//            ps.setDate(5, (Date) recipient.getLastVisitDate());
//            ps.setInt(6, recipient.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static void updateRecipient(Recipient recipient) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "UPDATE user SET username=?, password=?, email=?, phone=?, last_seen=? "
                + "WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
//            ps.setString(1, recipient.getUsername());
//            ps.setString(2, recipient.getPwd());
//            ps.setString(3, recipient.getEmail());
//            ps.setString(4, recipient.getPhone());
//            ps.setDate(5, (Date) recipient.getLastVisitDate());
//            ps.setInt(6, recipient.getStatus());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static void getRecipient(int id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM recipient WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
//                Recipient recipient = new Recipient(rs.getInt("id"), );
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }

}
