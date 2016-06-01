package az.qutan.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @version 1.0     May 26, 2016
 * @author Veronika Romashkina
 * @email    vrom911@gmail.com
 * Qutan
 * Class: Base
 */
public class Base implements Serializable {
    protected BigDecimal id;
    protected int status;

    public Base() {
        this.id = BigDecimal.ZERO;
        this.status = 0;
    }

    public Base(BigDecimal id, int status) {
        this.id = id;
        this.status = status;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
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
