package az.qutan.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: User
 */
public class User extends Base{

    private static final long serialVersionUID = -4352773930298689691L;
    private String username;
    private String pwd;
    private String email;
    private String phone;
    private Date lastVisitDate;

    public User() {
    }

    public User(BigDecimal id, String username, String pwd, String email, String phone, Date lastVisitDate, int status) {
        super(id, status);
        this.username = username;
        this.pwd = pwd;
        this.email = email;
        this.phone = phone;
        this.lastVisitDate = lastVisitDate;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastVisitDate() {
        return lastVisitDate;
    }

    public void setLastVisitDate(Date lastVisitDate) {
        this.lastVisitDate = lastVisitDate;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", pwd=" + pwd + ", email=" + email + ", phone=" + phone + ", lastVisitDate=" + lastVisitDate + '}';
    }





}
