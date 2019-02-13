/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_demo;

import control.SwordControl;
import model.Sword;
import view.SwordView;

/**
 *
 * @author jamesK
 */
public class MVC_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fetch current settings
        Sword model = retrieveSword();
        
        // view
        SwordView view = new SwordView();
        
        // controller
        SwordControl control = new SwordControl(model,view);
        control.updateView();
        
        System.out.println("Changing Name to Claymore, and Culture to be correct");
        // update
        control.setSwordName("Claymore");
        control.setCulture("Scottish");
        control.updateView();
    }
    
    private static Sword retrieveSword() {
        Sword sword = new Sword();
        sword.setName("Zweihander");
        sword.setSidesBladed(2);
        sword.setCulture("German");
        sword.setHanded("Two Hands Required");
        return sword;
    }
}
