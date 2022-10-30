package Main;

import java.io.IOException;
import java.util.Scanner;
public class Methods {
    /**
     * Denna klass innehåller metoder som används i dagboken
     */

    static Scanner scanner = new Scanner(System.in);
    static int choice = 0;

    /**
     * Metod för startmenyn
     */
    public static void mainMenu(){
        System.out.println("Welcome to your diary, what would you like to do?");
        System.out.println("1. Create a new post");
        System.out.println("2. Read archived posts");
        System.out.println("3. Quit the program");
        System.out.println("Enter your choice here: ");
    }

    /**
     * Metod för att gå tilbaks till startmenyn
     */
    public static void goToMenu(){
        System.out.println("Press Enter to return to the menu");
        try
        {
            scanner.nextLine();
            mainMenu();
        }
        catch(Exception e)
        {}
    }
}