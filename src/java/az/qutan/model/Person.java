package az.qutan.model;

import java.util.Date;

/**
 *
 * @version 1.0     May 30, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Person
 */
public class Person extends Base{
    private String firstname;
    private String surname;
    private String gender;
    private int city;
    private Date birthday;
    private Date creationDate;
    private User creator;
//    Status : 1 if creator and person is the same
    private int personStatus;

    public Person() {
    }

    public Person(int id, String firstname, String surname, String gender, int city, Date birthday, Date creationDate, User creator, int personStatus, int status) {
        super(id, status);
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.city = city;
        this.birthday = birthday;
        this.creationDate = creationDate;
        this.creator = creator;
        this.personStatus = personStatus;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public int getPersonStatus() {
        return personStatus;
    }

    public void setPersonStatus(int personStatus) {
        this.personStatus = personStatus;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", surname=" + surname + ", gender=" + gender + ", city=" + city + ", birthday=" + birthday + ", creationDate=" + creationDate + ", creator=" + creator + ", personStatus=" + personStatus + '}';
    }



}
