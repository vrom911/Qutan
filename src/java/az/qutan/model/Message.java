package az.qutan.model;

/**
 *
 * @version 1.0     May 31, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Message
 */
public class Message extends Base{
    private String fullname;
    private String email;
    private String phone;
    private String text;
    private int responseStatus;

    public Message() {
    }

    public Message(int id, String fullname, String email, String phone, String text, int responseStatus, int status) {
        super(id, status);
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.text = text;
        this.responseStatus = responseStatus;
    }

    public Message(String fullname, String email, String phone, String text, int responseStatus) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.text = text;
        this.responseStatus = responseStatus;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(int responseStatus) {
        this.responseStatus = responseStatus;
    }

    @Override
    public String toString() {
        return "Message{" + "fullname=" + fullname + ", email=" + email + ", phone=" + phone + ", text=" + text + ", responseStatus=" + responseStatus + '}';
    }

}
