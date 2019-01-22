/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import view.Banners;

/**
 * Threads,  Executors, and Runnable Example.
 * Threads:  Similar to how a computer's processor executes commands in "threads,"
 *           a Java program can also execute various tasks.  In this context, a
 *           Thread refers to a "thread of execution," kind of like the "Processes"
 *           section of Task Manager on windows. 
 * Runnable: A Java interface which allows classes with which it is implemented
 *           to be executed by a Thread.
 * Executor: Not only how the player is referred to by the Protoss of Starcraft, 
 *           an Executor is an object which executes Runnable-s. Normally used for
 *           automating thread creation and process completion. 
 * @author jamesK
 */
public class ThreadExecutorRunnable implements Runnable {

    // member variables
    private String command;
    Banners banner = new Banners();
    
    /******************************************
     * Default Constructor
     *****************************************/
    public ThreadExecutorRunnable() {
    }

    /******************************************
     * Constructor with String Parameter
     * @param s 
     *****************************************/    
    public ThreadExecutorRunnable(String s) {
        this.command = s;
    }
    
    // you must implement this method for Runnable to be properly integrated.
    @Override
    public void run() {
        banner.createBanner_Min(Thread.currentThread().getName() + "Start Command = " + command);
        processCommand();
        banner.createBanner_Min(Thread.currentThread().getName() + "End.");
    }
    
    // what we are having each of the threads do - basically sleep for 5 seconds.
    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void demo() {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new ThreadExecutorRunnable("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            
        }
        System.out.println("Demonstration Complete");
    }
        
}
