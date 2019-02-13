/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jamesK
 */
public class Sword {
    
    // variables
    private String name;
    private int sidesBladed;
    private String culture;
    private String handed;
    
    // constructor with arguments

    public Sword() {
        
    }
    
    public Sword(String name, int sidesBladed, String culture, String handed) {
        this.name = name;
        this.sidesBladed = sidesBladed;
        this.culture = culture;
        this.handed = handed;
    }
    
    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSidesBladed() {
        return sidesBladed;
    }

    public void setSidesBladed(int sidesBladed) {
        this.sidesBladed = sidesBladed;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getHanded() {
        return handed;
    }

    public void setHanded(String handed) {
        this.handed = handed;
    }        
}
