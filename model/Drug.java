/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha.model;

/**
 *
 * @author RunEvil
 */
public class Drug {
    public String name;
    public double price;
    public int availability;

    public Drug() {
    }

    public Drug(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
