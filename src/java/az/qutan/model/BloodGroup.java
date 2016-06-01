/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package az.qutan.model;

import java.math.BigDecimal;

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

    public BloodGroup(BigDecimal id, String name, String rhesus, int status) {
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
