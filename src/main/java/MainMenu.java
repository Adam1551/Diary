import com.fasterxml.jackson.databind.ObjectMapper;
import main.java.PostList;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) throws IOException {

        mainMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice here: ");
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice < 3) {

            if (choice == 1) {
                PostList post = new PostList();
                System.out.println("Enter your title: ");
                String title = scanner.nextLine();
                post.setTitle(title);
                List<PostList> post1 = List.of(post);
                post.setDate(String.valueOf(LocalDate.now()));
                System.out.println(post.getDate());

                Scanner firstChoice = new Scanner(System.in);
                System.out.println("Press enter to return to the menu");
                String choice1 = firstChoice.nextLine();
                mainMenu();
            }

            else if (choice == 2) {
                ObjectMapper mapper = new ObjectMapper();
                PostList[] postLists = mapper.readValue(Paths.get("src/main/resources/posts.json").toFile(), PostList[].class);
                System.out.println("This is your archived posts");
                System.out.println("Press enter to return to the menu");
                return;
            }

            else if (choice == 3) {
                System.out.println("You chose the third alternative, press enter to exit program");
                break;
            }

            else {
                System.out.println("Something went wrong, choose a number between 1 and 3");
                break;
            }

        }

    }
    static void mainMenu(){
        System.out.println("Welcome to your own diary, what would you like to do?");
        System.out.println("1. Create a new post");
        System.out.println("2. Read archived posts");
        System.out.println("3. Quit the program");
    }
}
