/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.Banner;
import model.*;
import java.util.Scanner;
import view.*;

/**
 *
 * @author jamesK
 */
public class MenuControl {

    private final Scanner userInput;
    private String menuOption;

    /**
     * **********************************************************************
     * CONSTRUCTOR
     * *********************************************************************
     */
    public MenuControl() {

        this.userInput = new Scanner(System.in);
        this.menuOption = "A";
        mainMenu();
    }

    /**
     * **********************************************************************
     * MAIN MENU
     * *********************************************************************
     */
    public void mainMenu() {
        do {
            Menus.mainMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "1":
                    // Collections
                    collectionsMenu();
                    break;
                case "2":
                    // Threads, Executors, Runnables
                    threadsMenu();
                    break;
                case "3":
                    // Application Controller Pattern
                    applicationControllerPatternMenu();
                    break;
                case "4":
                    // MVC
                    mvcMenu();
                    break;
                case "5":
                    // Hibernate
                    hibernateMenu();
                    break;
                case "6":
                    // QCJSON and JSON
                    sonMenu();
                    break;
                case "7":
                    // AndroidHttpURL Connection
                    androidMenu();
                    break;
                case "8":
                    // Servlets
                    servletsMenu();
                    break;
                case "9":
                    // JUnit Tests
                    junitTestsMenu();
                    break;
                case "10":
                    // System Level Tests
                    systemLevelTestsMenu();
                    break;
                case "11":
                    // Use Case Diagrams
                    useCaseDiagramsMenu();
                    break;
                case "12":
                    // Use Case Documents
                    useCaseDocumentsMenu();
                    break;
                case "13":
                    // State Diagrams
                    stateDiagramsMenu();
                    break;
                case "14":
                    // Sequence Diagrams
                    sequenceDiagramsMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
                    break;
                default:
                    Banner.createBanner_Maj("Invalid Input");
                    break;
            }
        } while (!"Q".equals(menuOption));
    }

    /**
     * **********************************************************************
     * COLLECTIONS MENU
     * *********************************************************************
     */
    public void collectionsMenu() {
        do {
            Menus.collectionsMenu();
            Collections collect = new Collections();
            
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "1":
                    collect.listDemo();
                    break;
                case "2":
                    collect.mapDemo();
                    break;
                case "3":
                    collect.queueDemo();
                    break;
                case "4":
                    collect.setDemo();
                    break;
                case "5":
                    collect.treeDemo();
                    break;
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
                default:
                    Banner.createBanner_Maj("Invalid Input");
                    break;
            }
        } while (!"B".equals(menuOption));

    }

    /**
     * **********************************************************************
     * THREADS, EXECUTORS, & RUNNABLES MENU
     * *********************************************************************
     */
    public void threadsMenu() {
        do {
            Menus.threadexecutorrunnableMenu();
            String input = userInput.next();
            menuOption = input;
            ThreadExecutorRunnable ter = new ThreadExecutorRunnable();

            // switch statement
            switch (input) {
                case "1":
                    Banner.createBanner_Maj("Demonstration Starting");
                    ter.demo();
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * APPLICATION CONTROLLER PATTERN MENU
     * *********************************************************************
     */
    public void applicationControllerPatternMenu() {
        do {
            Menus.applicationcontrollerpatternMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * MVC MENU
     * *********************************************************************
     */
    public void mvcMenu() {
        do {
            Menus.mvcMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * HIBERNATE MENU
     * *********************************************************************
     */
    public void hibernateMenu() {
        do {
            Menus.hibernateMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * QCJSON & JSON MENU
     * *********************************************************************
     */
    public void sonMenu() {
        do {
            Menus.qjsonjsonMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * ANDROID HTTPURLCONNECTION MENU
     * *********************************************************************
     */
    public void androidMenu() {
        do {
            Menus.androidhttpurlconnectionMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * SERVLETS MENU
     * *********************************************************************
     */
    public void servletsMenu() {
        do {
            Menus.servletsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * JUNIT TESTS MENU
     * *********************************************************************
     */
    public void junitTestsMenu() {
        do {
            Menus.junittestsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * SYSTEM LEVEL TESTS MENU
     * *********************************************************************
     */
    public void systemLevelTestsMenu() {
        do {
            Menus.systemleveltestsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * USE CASE DIAGRAMS MENU
     * *********************************************************************
     */
    public void useCaseDiagramsMenu() {
        do {
            Menus.usecasediagramsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * USE CASE DOCUMENTS MENU
     * *********************************************************************
     */
    public void useCaseDocumentsMenu() {
        do {
            Menus.usecasedocumentsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * STATE DIAGRAMS MENU
     * *********************************************************************
     */
    public void stateDiagramsMenu() {
        do {
            Menus.statediagramsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }

    /**
     * **********************************************************************
     * SEQUENCE DIAGRAMS MENU
     * *********************************************************************
     */
    public void sequenceDiagramsMenu() {
        do {
            Menus.sequencediagramsMenu();
            String input = userInput.next();
            menuOption = input;

            // switch statement
            switch (input) {
                case "B":
                    Banner.createBanner_Maj("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banner.createBanner_Maj("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
}
