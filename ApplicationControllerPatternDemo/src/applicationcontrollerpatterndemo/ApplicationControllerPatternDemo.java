/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpatterndemo;

import java.util.Scanner;

/**
 *
 * @author jamesK
 */
public class ApplicationControllerPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // input and controller
            Scanner input = new Scanner(System.in);
            Controller calc = new Controller();

            // variables
            Integer inputA;
            Integer inputB;
            String operator;

            System.out.println("Enter the first Number");
            inputA = Integer.parseInt(input.nextLine());

            System.out.println("Enter the second Number");
            inputB = Integer.parseInt(input.nextLine());

            System.out.println("What Operation would you like to do?");
            operator = input.nextLine();

            System.out.println(inputA + " " + operator + " " + inputB + " = ");
            
            calc.handler(operator, inputA, inputB);

        } catch (NumberFormatException x) {

            System.out.println("******************************");
            System.out.println("* Please Enter Valid Numbers *");
            System.out.println("******************************");

            Scanner input = new Scanner(System.in);
            Controller calc = new Controller();

            // variables
            Integer inputA;
            Integer inputB;
            String operator;

            System.out.println("Enter the first Number");
            inputA = Integer.parseInt(input.nextLine());

            System.out.println("Enter the second Number");
            inputB = Integer.parseInt(input.nextLine());

            System.out.println("What Operation would you like to do?");
            operator = input.nextLine();

            System.out.println(inputA + " " + operator + " " + inputB + " = ");

            calc.handler(operator, inputA, inputB);
        }
    }

}
