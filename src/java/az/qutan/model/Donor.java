package az.qutan.model;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Donor
 */
public class Donor extends Base{
    private User user;
    private int donorStatus;
    private int weight;
    private BloodGroup bloodGroup;
    private int availability;
    private String applicableState;
    private int rating;
    private int givenBlood;

    public Donor() {
    }

    public Donor(int id, User user, int donorStatus, int weight, BloodGroup bloodGroup, int availability, String applicableState, int rating, int givenBlood, int status) {
        super(id, status);
        this.user = user;
        this.donorStatus = donorStatus;
        this.weight = weight;
        this.bloodGroup = bloodGroup;
        this.availability = availability;
        this.applicableState = applicableState;
        this.rating = rating;
        this.givenBlood = givenBlood;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getDonorStatus() {
        return donorStatus;
    }

    public void setDonorStatus(int donorStatus) {
        this.donorStatus = donorStatus;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getApplicableState() {
        return applicableState;
    }

    public void setApplicableState(String applicableState) {
        this.applicableState = applicableState;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getGivenBlood() {
        return givenBlood;
    }

    public void setGivenBlood(int givenBlood) {
        this.givenBlood = givenBlood;
    }

    @Override
    public String toString() {
        return "Donor{" + "user=" + user + ", donorStatus=" + donorStatus + ", weight=" + weight + ", bloodGroup=" + bloodGroup + ", availability=" + availability + ", applicableState=" + applicableState + ", rating=" + rating + ", givenBlood=" + givenBlood + '}';
    }


}
