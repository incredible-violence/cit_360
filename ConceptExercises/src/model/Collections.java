/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import view.*;

/**
 *
 * @author jamesK
 */
public class Collections extends Demo {
    Banners banner = new Banners();

    public Collections(String demotype) {
        super(demotype);
    }

    public void listDemo() {
        
        // create list (ArrayList)
        System.out.println("Creating New List");
        List<Integer> demoList = new ArrayList<>();

        // populate list
        System.out.println("Populating List with integers 0 - 10");
        // list has contents equivalent to its index for purposes of demonstration
        for (int i = 0; i < 10; i++) {
            demoList.add(i);
        }

        // demonstrate List aspect 1
        System.out.println("A Java List allows access to internal elements by "
                + "referencing integer position, starting at 0.");

        // demonstrate List allows duplicate elements
        System.out.println("Lists, unlike Sets, allow duplicate elements");

        // demonstrate List inheiritance of iterator, add, remove, equals, and 
        // hashcode from Collections parent class
        // iterator
        // add
        // remove
        // equals
        // hashcode
        // demonstrate special iterator ListIterator
        // 
    }
    
    public void setDemo() {
        
    }
    
    public void queueDemo() {
        
    }
    
    public void mapDemo() {
        
    }
    
    public void treeDemo() {
        
    }

}
