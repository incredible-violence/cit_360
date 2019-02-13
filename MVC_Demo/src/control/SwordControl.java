/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Sword;
import view.SwordView;

/**
 *
 * @author jamesK
 */
public class SwordControl {
    private Sword model;
    private SwordView view;
    
    public SwordControl(Sword model, SwordView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setSwordName(String name) {
        model.setName(name);
    }
    
    public String getSwordName() {
        return model.getName();
    }
    
    public void setSides(int sides) {
        model.setSidesBladed(sides);
    }
    
    public int getSides() {
        return model.getSidesBladed();
    }
    
    public void setCulture(String culture) {
        model.setCulture(culture);
    }
    
    public String getCulture() {
        return model.getCulture();
    }
    
    public void setHands(String hands) {
        model.setHanded(hands);
    }
    
    public String getHands() {
        return model.getHanded();
    }
    
    public void updateView() {
        view.printSwordDetails(model.getName(), model.getSidesBladed(), model.getCulture(), model.getHanded());
    }
    
}
