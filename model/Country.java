/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.model;

import java.util.ArrayList;

/**
 *
 * @author RunEvil
 */
public class Country {
    public String name;
    public ArrayList<Drug> drugs;

    public Country() {
    }

    public Country(String name, ArrayList<Drug> drugs) {
        this.name = name;
        this.drugs = drugs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }
}
