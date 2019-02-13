/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.Sword;
import control.*;

/**
 *
 * @author jamesK
 */
public class SwordInput {

    // default constructor
    public SwordInput() {

    }

    public static Sword displayInput() {
        Scanner input = new Scanner(System.in);

        // greeting
        System.out.println("");
        System.out.println("Add a Sword");
        System.out.println("*************************");

        // prompt user for sword name
        System.out.println("Sword Name: ");
        String name = input.nextLine();
        
        // prompt for sides bladed
        System.out.println("Number of bladed sides: ");
        int sides = Integer.parseInt(input.nextLine());
        
        // prompt for culture
        System.out.println("Culture of Origin: ");
        String culture = input.nextLine();
        
        // prompt for handedness
        System.out.println("Number of Hands to Wield: ");
        String hands = input.nextLine();
        
        Sword newSword = new Sword();
        
        return newSword;
    }
}
