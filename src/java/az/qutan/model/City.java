package az.qutan.model;

/**
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: City
 */
public class City extends Base {

    private static final long serialVersionUID = -5747581572463759957L;
    private String name;
    private Country country;

    public City() {
        super();
        this.name = "";
    }

    public City(int id, String name, Country country, int status) {
        super(id, status);
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +"id=" + id + ", name=" + name + ", country=" + country + ", status=" + status + '}';
    }
}
