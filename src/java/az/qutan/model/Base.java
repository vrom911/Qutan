package az.qutan.model;

import java.io.Serializable;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Base
 */
public class Base implements Serializable {
    protected int id;
    protected int status;

    public Base() {
        this.id = 0;
        this.status = 0;
    }

    public Base(int id, int status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Base{" + "id=" + id + ", status=" + status + '}';
    }


}
