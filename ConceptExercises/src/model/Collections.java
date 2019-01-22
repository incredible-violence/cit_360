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
public class Collections {

    public Collections() {
        // Banner.createBanner_Maj("Collections Constructor Called");        
    }
    
    public void listDemo() {
        Banner.createBanner_Maj("List Demonstration");
        
        // create list (ArrayList)
        Banner.createBanner_Min("Creating New List");
        List<Integer> demoList = new ArrayList<>();

        // populate list
        Banner.createBanner_Min("Populating List with integers 0 - 10");
        // list has contents equivalent to its index for purposes of demonstration
        for (int i = 0; i < 10; i++) {
            demoList.add(i);
            Banner.createBanner_Min("Inserting " + i + " at index " + i);
        }

        // demonstrate List aspect 1        
        Banner.createBanner_Min("by using the method 'get', we can access List "
                + "content by index reference");
        
        Banner.createBanner_Min("Index 0 should have a value of 0, 1 of 1, and "
                + "so on:");
        
        Banner.createBanner_Min("0: " + demoList.get(0));

        // demonstrate List allows duplicate elements
        Banner.createBanner_Min("Lists, unlike Sets, allow duplicate elements");

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
