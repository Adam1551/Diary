import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to your own diary, what would you like to do?");
        System.out.println("1. Create a new post");
        System.out.println("2. Read archived posts");
        System.out.println("3. Quit the program");

        Scanner menuChoise = new Scanner(System.in);
        System.out.println("Enter your choise here: ");
        int choise = menuChoise.nextInt();

    }
}
