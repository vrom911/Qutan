package az.qutan.data;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: SubscriberDB
 */
public class SubscriberDB {
    public static int insertSubscriber(String email) {
        int indicator = 0;
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String queryCheck = "Select * FROM subscriber WHERE email=? AND status=0";
        String queryInsert = "INSERT INTO subscriber (email) VALUES (?)";
        try {
            ps = connection.prepareStatement(queryCheck);
            ps.setString(1, email);

            rs = ps.executeQuery();
            if (rs.next()) {
                indicator = -1;
            } else {
                ps = connection.prepareStatement(queryInsert);
                ps.setString(1, email);
                ps.executeUpdate();
                indicator = 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        return indicator;
    }
    public static void emailExist(String email) {

    }
    public static void unsubscribe(String email) {

    }
}
