package az.qutan.model;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Country
 */
public class Country extends Base {

    private static final long serialVersionUID = -6977820319730608966L;
    private String name;

    public Country() {
        super();
        this.name = "";
    }

    public Country(int id, String name, int status) {
        super(id, status);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" + " id=" + id + ", name=" + name + ", status=" + status + '}';
    }



}

