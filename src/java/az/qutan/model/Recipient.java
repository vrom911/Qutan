package az.qutan.model;

import java.util.Date;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Receipent
 */
public class Recipient extends Base {
    private User user;
    private Person person;
    private Date lastVisitDate;
    private int userStatus;
    private BloodGroup bloodGroup;

    public Recipient() {
    }

    public Recipient(int id, User user, Person person, Date lastVisitDate, int userStatus, BloodGroup bloodGroup, int status) {
        super(id, status);
        this.user = user;
        this.person = person;
        this.lastVisitDate = lastVisitDate;
        this.userStatus = userStatus;
        this.bloodGroup = bloodGroup;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Recipient{" + "user=" + user + ", person=" + person + ", lastVisitDate=" + lastVisitDate + ", userStatus=" + userStatus + ", bloodGroup=" + bloodGroup + '}';
    }


}
