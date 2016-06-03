package az.qutan.data;

import az.qutan.model.Person;
import az.qutan.model.User;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: PersonDB
 */
public class PersonDB {
    public static int insertPerson(Person person) {
        int id = -1;
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query =
                "INSERT INTO person (firstname, surname, gender, city_id, birthday, creation_date, creation_user_id, user_status )"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, person.getFirstname());
            ps.setString(2, person.getSurname());
            ps.setString(3, person.getGender());
            ps.setInt(4, person.getCity());
            ps.setDate(5, (Date) person.getBirthday());
            ps.setDate(6, (Date) person.getCreationDate());
            ps.setInt(7, person.getCreator().getId());
            ps.setInt(8, person.getPersonStatus());

            ps.executeUpdate();

            rs = ps.getGeneratedKeys();
            if (rs.next()){
                id=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        return id;
    }

    public static Person getPerson(int id) {
        Person person = null;
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT * FROM person INNER JOIN user ON person.creator_user_id=user.id WHERE person.id=?";
        try {
            ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);

            rs = ps.executeQuery();
            if (rs.next()) {
                User user = new User(rs.getInt("creator_user_id"),rs.getString("username"), "secret", rs.getString("email"), "", rs.getDate("last_visit_date"),0 );
                person = new Person(rs.getInt("id"),rs.getString("firstname"), rs.getString("surname"),
                rs.getString("gender"), rs.getInt("city"), rs.getDate("birthday"), rs.getDate("creation_date"),  user, rs.getInt("user_status"), rs.getInt("status"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
        return person;
    }
}
