/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author jamesK
 */
public class SwordView {
    
    public void printSwordDetails(String swordName, int bladedSides, String culture, String hands) {
        System.out.println("Sword: ");
        System.out.println("Name:           " + swordName);
        System.out.println("Bladed Sides:   " + bladedSides);
        System.out.println("Culture:        " + culture);
        System.out.println("Hands to Use:   " + hands);
    }
}
