/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
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

        // demonstrate get      
        Banner.createBanner_Min("by using the method 'get', we can access List "
                + "content by index reference");

        Banner.createBanner_Min("Index 0 should have a value of 0, 1 of 1, and "
                + "so on:");

        Banner.createBanner_Min("0: " + demoList.get(0));

        // demonstrate List allows duplicate elements
        Banner.createBanner_Min("Lists, unlike Sets, allow duplicate elements");

        Banner.createBanner_Min("Adding 10 elements of value 25");

        for (int i = 0; i < 10; i++) {
            demoList.add(25);
            Banner.createBanner_Min("Inserting " + 25 + " at index " + (i + 10));
        }

        // demonstrate ListIterator
        Banner.createBanner_Min("In addition to a standard iterator, Lists "
                + "use a special Iterator, called ListIterator.");
        Banner.createBanner_Min("This iterator uses while loops, and is more"
                + " character efficient than a traditional iterator. ");
        Banner.createBanner_Min("It can also easily loop forward or backward");

        // declare listIterator
        ListIterator<Integer> demoIterator = demoList.listIterator();

        // loop forward
        Banner.createBanner_Min("Looping Forward");
        while (demoIterator.hasNext()) {
            Banner.createBanner_Min("Index: "
                    + demoIterator.nextIndex()
                    + "Content: "
                    + demoIterator.next());
        }

        // loop backward
        Banner.createBanner_Min("Looping Backward");
        while (demoIterator.hasPrevious()) {
            Banner.createBanner_Min("Index: "
                    + demoIterator.previousIndex()
                    + " Content: "
                    + demoIterator.previous());
        }

        // demonstrate clear
        Banner.createBanner_Min("Lastly, an ArrayList can be emptied by its"
                + "'clear' method. This does not destroy the List itself, "
                + "but all of the data inside of it.");
        Banner.createBanner_Min("Looping through the List again, after using"
                + "clear: ");

        demoList.clear();

        while (demoIterator.hasNext()) {
            Banner.createBanner_Min("Index: "
                    + demoIterator.nextIndex()
                    + "Content: "
                    + demoIterator.next());
        }

        // demonstrate isEmpty()
        Banner.createBanner_Min("To check if the List is empty, we use isEmpty,"
                + "which returns a boolean value. If it's empty, we should see"
                + "a message denoting this.");
        if (demoList.isEmpty()) {
            Banner.createBanner_Min("demoList is empty");
        } else {
            Banner.createBanner_Min("demoList is not empty");
        }

        Banner.createBanner_Min("List Demonstration End");
    }

    public void setDemo() {
        Banner.createBanner_Maj("Set Demonstration");

        // create a Set
        Banner.createBanner_Min("Creating Set");
        Set<String> setDemo = new HashSet<>();

        // add things to set
        Banner.createBanner_Min("Populating Set with 'one' through 'five'.");
        
        setDemo.add("one");
        setDemo.add("two");
        setDemo.add("three");
        setDemo.add("four");
        setDemo.add("five");
        
        // sets are not organized
        Banner.createBanner_Min("Sets by default are not organized.");
        Banner.createBanner_Min("We can see this when we output the set.");
        Banner.createBanner_Min("We should see the contents of the set, but in no particular order.");
        Banner.createBanner_Min("Set Readout: ");
        Banner.createBanner_Min("" + setDemo);

        // try to add thing already in set to set, show that it doesn't work
        Banner.createBanner_Min("Sets do not allow duplicate elements.");
        Banner.createBanner_Min("Attempting to add 'one' to set.");
        setDemo.add("one");
                
        // iterate through set
        Banner.createBanner_Min("" + setDemo);
        
        Banner.createBanner_Min("We can see that 'one' was not added to the set.");
        
    }

    public void queueDemo() {
        Banner.createBanner_Maj("Queue Demo");
        
        // create queue
        Banner.createBanner_Min("Queue is an abstract class, one implementation of which is the LinkedList");
        Queue<Integer> queueDemo = new LinkedList<>();
         
        // add items to queue
        for (int i = 0; i < 10; i++) {
            queueDemo.add(i);
        }
        
        Banner.createBanner_Min("Adding integers 1 through 10 to queue");
        
        // demonstrate first in, first out functionality
        Banner.createBanner_Min("Queue Contents:" + queueDemo);  
    }

    public void mapDemo() {

        // create map
        Map mapDemo = new HashMap();
        
        // add items to map
        mapDemo.put("Professor X", "Telepath");
        mapDemo.put("Cyclops", "Eye Portals to a pure energy dimension");
        mapDemo.put("Magneto", "Control of Metal");
        mapDemo.put("Jean Grey", "Telepath / Host of the Phoenix Force - Occasionally");
        mapDemo.put("Mystique", "Bodily replication / alteration");
        mapDemo.put("Nightcrawler", "Teleportation");
        mapDemo.put("Kitty Pryde", "Mass Manipulation");
        mapDemo.put("Legion", "Telepath / Thousands of personalities with different powers");
        mapDemo.put("X-Man", "Able to exist as an incorporeal energy / Omnipotent");
        
        Banner.createBanner_Min("Map Demo: ");
        Banner.createBanner_Min("Various Mutants of Marvel Comics and their powers: ");
        
        mapDemo.forEach((k,v) -> Banner.createBanner_Min("Mutant: " + k + "- Powers: " + v));
    }

    public void treeDemo() {       
        // tree representative of a restaurant's menu
        // using an outside class, trees require a framework
        
        // main branches of tree        
        // root: menu
        Node<String> menu = new Node<>("Menu");
        // node: appetizers
        Node<String> appetizers = menu.addChild(new Node<>("Appetizers"));
        // node: entrees
        Node<String> entrees = menu.addChild(new Node<>("Entrees"));
        // node: desserts
        Node<String> desserts = menu.addChild(new Node<>("Desserts"));
        // node: beverages
        Node<String> beverages = menu.addChild(new Node<>("Beverages"));
        
        // content of branches
        List<Node<String>> appetizersList = new ArrayList<>();
        List<Node<String>> entreesList = new ArrayList<>();
        List<Node<String>> dessertsList = new ArrayList<>();
        List<Node<String>> beveragesList = new ArrayList<>();
        
        // populate appetizers list
        appetizersList.add(new Node<>("Soup"));
        appetizersList.add(new Node<>("Salad"));
        appetizersList.add(new Node<>("Potato"));
        appetizersList.add(new Node<>("Fries"));
        appetizersList.add(new Node<>("Onion Rings"));
        appetizersList.add(new Node<>("Hot Wings"));
        appetizers.addChildren(appetizersList);
        
        // populate the entrees list
        entreesList.add(new Node<>("Steak"));
        entreesList.add(new Node<>("Burger"));
        entreesList.add(new Node<>("Sandwich"));
        entreesList.add(new Node<>("Pizza"));
        entreesList.add(new Node<>("Sub"));
        entreesList.add(new Node<>("Fish"));
        entreesList.add(new Node<>("Chicken"));
        entrees.addChildren(entreesList);
        
        // populate the desserts list
        dessertsList.add(new Node<>("Cake"));
        dessertsList.add(new Node<>("Pie"));
        dessertsList.add(new Node<>("Cheesecake"));
        dessertsList.add(new Node<>("TresLeche"));
        dessertsList.add(new Node<>("Sweet Roll"));
        desserts.addChildren(dessertsList);
        
        // populate the beverages list
        beveragesList.add(new Node<>("Pepsi"));
        beveragesList.add(new Node<>("Coke"));
        beveragesList.add(new Node<>("Root Beer"));
        beveragesList.add(new Node<>("Lemonade"));
        beveragesList.add(new Node<>("Dr. Pepper"));
        beveragesList.add(new Node<>("Sprite"));
        beveragesList.add(new Node<>("Raspberry Lemonade"));
        beveragesList.add(new Node<>("Huckleberry Soda"));
        beverages.addChildren(beveragesList);
        
        // print out the full tree
        printTree(menu, " ");        
    }
    
    private static <T> void printTree(Node<T> node, String delimiter) {
        Banner.createBanner_Min(delimiter + node.getData());
        node.getChildren().forEach(each -> printTree(each, delimiter + delimiter));
    }
}

// maybe alter above to use these enums instead of multiple strings later
enum Beverages {
     Pepsi, CocaCola, RB, Lemonade, DrPepper, Sprite, RaspLemonade;
}

enum Entrees {
    Steak, Burger, Sandwich, Pizza, Sub, Fish, Chicken;
}

enum Desserts {
    Cake, Pie, Cheesecake, TresLeche, SweetRoll;
}

enum Appetizers {
    Soup, Salad, Potato, Fries;
}