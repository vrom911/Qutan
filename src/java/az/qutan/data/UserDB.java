package az.qutan.data;

import az.qutan.model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @version 1.0     May 31, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: UserDB
 */
public class UserDB {

    public static int insertUser(User user) {
        int id = -1;
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "INSERT INTO user (username, password, email, phone, last_seen, status )"
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPwd());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setDate(5, (Date) user.getLastVisitDate());
            ps.setInt(6, user.getId());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()){
                id=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        return id;
    }
    public static void updateUser(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "UPDATE user SET username=?, password=?, email=?, phone=?, last_seen=? "
                + "WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPwd());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPhone());
            ps.setDate(5, (Date) user.getLastVisitDate());
            ps.setInt(6, user.getStatus());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static void updateUserStatus(User user) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "UPDATE user SET status=? "
                + "WHERE id=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setInt(1, user.getStatus());
            ps.setInt(2, user.getId());

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static User selectUser(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT * FROM user "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            User user = null;
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPwd(rs.getString("pwd"));
                user.setEmail(rs.getString("email"));
                user.setLastVisitDate(rs.getDate("last_seen"));
                user.setStatus(rs.getInt("status"));
            }
            return user;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    public static boolean usernameExists(String username) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String query = "SELECT username FROM user "
                + "WHERE username = ?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
