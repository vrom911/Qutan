package az.qutan.model;

/**
 *
 * @version 1.0     May 30, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: BloodGroup
 */
public class BloodGroup extends Base{
    private String name;
    private String rhesus;

    public BloodGroup() {
        this.name = "";
        this.rhesus = "";
    }

    public BloodGroup(int id, String name, String rhesus, int status) {
        super(id, status);
        this.name = name;
        this.rhesus = rhesus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRhesus() {
        return rhesus;
    }

    public void setRhesus(String rhesus) {
        this.rhesus = rhesus;
    }

    @Override
    public String toString() {
        return "BloodGroup{" + "id=" + id + ", name=" + name + ", rhesus=" + rhesus + '}';
    }


}
