package az.qutan.model;

import java.util.Date;

/**
 *
 * @version 1.0     Jun 1, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Announcement
 */
public class Announcement extends Base{
    private Recipient receipent;
    private int bloodAmount;
    private Date dueDate;
    private String description;
    private int state;
    private Date lastModified;
    private Date creationDate;

    public Announcement() {
    }

    public Announcement(int id, Recipient receipent, int bloodAmount, Date dueDate, String description, int state, Date lastModified, Date creationDate, int status) {
        super(id, status);
        this.receipent = receipent;
        this.bloodAmount = bloodAmount;
        this.dueDate = dueDate;
        this.description = description;
        this.state = state;
        this.lastModified = lastModified;
        this.creationDate = creationDate;
    }

    public Recipient getRecipient() {
        return receipent;
    }

    public void setRecipient(Recipient receipent) {
        this.receipent = receipent;
    }

    public int getBloodAmount() {
        return bloodAmount;
    }

    public void setBloodAmount(int bloodAmount) {
        this.bloodAmount = bloodAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Announcement{" + "receipent=" + receipent + ", bloodAmount=" + bloodAmount + ", dueDate=" + dueDate + ", description=" + description + ", state=" + state + ", lastModified=" + lastModified + ", creationDate=" + creationDate + '}';
    }

}
