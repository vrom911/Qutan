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
 * Class: CityDB
 */
public class CityDB {
    public static void getCity(int id) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM city WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
//                C  ity city = new City();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CityDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static void insertCity(String name, int country) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "INSERT INTO city (name, country_id) VALUES (?,?)";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, name.substring(0, 1).toUpperCase() + name.substring(1));
            ps.setInt(2, country);

            rs = ps.executeQuery();
            if (rs.next()) {
//                C  ity city = new City();
            }
        } catch (SQLException ex) {
            Logger.getLogger(CityDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
