/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jamesK
 */
public class ListDemo extends Demo {
        
    public ListDemo(String demotype) {
        super(demotype);
        
        // demonstrate ArrayList
        
        // create an ArrayList
        List<Integer> list = new ArrayList<Integer> ();
        
        // populate list of numbers 1 through 10
        for (int i = 0; i < 10; i++) {
            list.add(i, i + 1);
        }
        
        // access random index and print out
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        System.out.println("Index: " + n);
        System.out.println("Content: " + list.indexOf(n));
    }
}
