/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.Banners;
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
                    Banners.createBanner_Big("Collections");
                    collectionsMenu();
                    break;
                case "2":
                    Banners.createBanner_Big("Threads, Executors, Runnables");
                    threadsMenu();
                    break;
                case "3":
                    Banners.createBanner_Big("Application Controller Pattern");
                    applicationControllerPatternMenu();
                    break;
                case "4":
                    Banners.createBanner_Big("MVC");
                    mvcMenu();
                    break;
                case "5":
                    Banners.createBanner_Big("Hibernate");
                    hibernateMenu();
                    break;
                case "6":
                    Banners.createBanner_Big("QCJSON & JSON");
                    sonMenu();
                    break;
                case "7":
                    Banners.createBanner_Big("Android HttpURLConnection");
                    androidMenu();
                    break;
                case "8":
                    Banners.createBanner_Big("Servlets");
                    servletsMenu();
                    break;
                case "9":
                    Banners.createBanner_Big("JUnit Tests");
                    junitTestsMenu();
                    break;
                case "10":
                    Banners.createBanner_Big("System Level Tests");
                    systemLevelTestsMenu();
                    break;
                case "11":
                    Banners.createBanner_Big("Use Case Diagrams");
                    useCaseDiagramsMenu();
                    break;
                case "12":
                    Banners.createBanner_Big("Use Case Documents");
                    useCaseDocumentsMenu();
                    break;
                case "13":
                    Banners.createBanner_Big("State Diagrams");
                    stateDiagramsMenu();
                    break;
                case "14":
                    Banners.createBanner_Big("Sequence Diagrams");
                    sequenceDiagramsMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
                    System.exit(0);
                    break;
                default:
                    Banners.createBanner_Big("Invalid Input");
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
            Collections collect = new Collections("Collections");
            Menus.collectionsMenu();
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
                    System.exit(0);
                default:
                    Banners.createBanner_Big("Invalid Input");
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

            // switch statement
            switch (input) {
                case "B":
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
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
                    Banners.createBanner_Big("Returning to Main Menu");
                    mainMenu();
                    break;
                case "Q":
                    Banners.createBanner_Big("Quitting Program");
                    System.exit(0);
            }
        } while (!"B".equals(menuOption));
    }
}
