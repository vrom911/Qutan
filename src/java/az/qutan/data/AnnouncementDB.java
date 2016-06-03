package az.qutan.data;

import az.qutan.model.Announcement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: AnnouncementDB
 */
public class AnnouncementDB {
    public static void insertAnnouncement(Announcement an) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "INSERT INTO announcement (id, receipent_id, blood_amount, due_date, description, state, last_changed, creation_date)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, an.getId());
            ps.setInt(2, an.getRecipient().getId());
            ps.setInt(3, an.getBloodAmount());
            ps.setDate(4, (Date) an.getDueDate());
            ps.setString(5, an.getDescription());
            ps.setInt(6, an.getState());
            ps.setDate(7, (Date) an.getLastModified());
            ps.setDate(8, (Date) an.getCreationDate());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static Announcement getAnnouncement(int id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM announcement WHERE id=?";


        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
//                Announcement an = new Announcement(rs.getInt("id"),);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        return null;
    }
}
