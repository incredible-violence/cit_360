/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontrollerpatterndemo;

/**
 *
 * @author jamesK
 */
public class Subtraction implements DoMath {
    public void execute(Integer input1, Integer input2) {
        Integer subtract = input1 - input2;
        System.out.println(subtract);
    }
}
