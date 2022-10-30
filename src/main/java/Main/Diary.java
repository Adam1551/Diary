package Main;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Main.Methods.*;

public class Diary {
    /**
     * Denna klass är själva dagboken, det är härifrån programmet körs
     */
    public static void main(String[] args) throws IOException {

        mainMenu();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        ObjectMapper mapper = new ObjectMapper();
        List<PostList> PostListEntries = List.of(mapper.readValue(Paths.get("src/main/resources/posts.json")
                        .toFile(), PostList[].class));

        //While loop så att programmet körs till användaren väljer att avsluta det
        while (choice != 3) {
            choice = Integer.parseInt(scanner.nextLine());

            //Om användaren väljer att skapa ett nytt inlägg
            if (choice == 1) {

                //Skapar en lista
                List<PostList> post = new ArrayList<>(PostListEntries);

                //Lägg till titel
                System.out.println("Enter your title: ");
                String title = scanner.nextLine();

                //Lägg till inlägg
                System.out.println("Enter your post: ");
                String newPost = scanner.nextLine();

                //Lägg till datum
                String date = LocalDate.now().toString();

                //Spara till JSON
                PostList newJSONEntry = new PostList(date,title,newPost);
                post.add(newJSONEntry);
                mapper.writeValue(Paths.get("src/main/resources/posts.json").toFile(), post);

                //Printa ut det färdiga inlägget
                System.out.println("_______________");
                System.out.println("This is your post");
                System.out.println("Date: " + newJSONEntry.getDate());
                System.out.println("Title: " + newJSONEntry.getTitle());
                System.out.println("Post: " + newJSONEntry.getPost());
                System.out.println("_______________");

                //Ber användaren återgå till menyn när inlägget är skapat
                goToMenu();
            }

            //Om användaren väljer att läsa befintliga inlägg
            else if (choice == 2) {
                System.out.println("These are your archived posts");
                System.out.println("_______________");
                PostList[] postLists = mapper.readValue(Paths.get("src/main/resources/posts.json").toFile(), PostList[].class);
                List<PostList> JSONEntries = List.of(mapper.readValue(Paths.get("src/main/resources/posts.json")
                        .toFile(), PostList[].class));

                //itererar genom listan med sparade inlägg och skriver ut
                for (PostList userEnter : JSONEntries) {
                    System.out.println("Date: " + userEnter.getDate());
                    System.out.println("Title: " + userEnter.getTitle());
                    System.out.println("Post: " + userEnter.getPost());
                    System.out.println("_______________");
                }
                //Ber användaren återgå till menyn när inlägget är skapat
                goToMenu();
            }

            //Om användaren vill avsluta programmet
            else if (choice == 3) {
                System.out.println("Thank you for using the diary, press enter to exit the program");
                try
                {
                    scanner.nextLine();
                }
                catch(Exception e)
                {}
            }

        }

    }

}
