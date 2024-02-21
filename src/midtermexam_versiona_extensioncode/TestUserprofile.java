/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Komal Kahlon
 */
import java.util.Scanner;

public class TestUserprofile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Drama");
        System.out.println("4. Horror");
        System.out.println("5. Romance");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int genreChoice = scanner.nextInt();

        String[] genres = {"Action", "Comedy", "Drama", "Horror", "Romance"};
        String genre;
        if (genreChoice >= 1 && genreChoice <= 5) {
            genre = genres[genreChoice - 1]; // Adjust index to match array
        } else {
            genre = "Unknown";
        }

        // Display message that userProfile was created
        System.out.println("User profile created successfully!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + genre);
    }
}

