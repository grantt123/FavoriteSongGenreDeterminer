//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: FavoriteSongGenre.java
// Description: This file is essentially where the output comes into the console and allows the user
// to fill in their favorite song genres for each day.
//*********************************************

import java.io.*;
import java.util.Scanner;

public class FavoriteSongGenre {
    public static void main(String[] args) throws IOException {
      try{
        Interface javaFX = new Interface();
        javaFX.create();

        System.out.println(Help.about());

        Scanner scanner = new Scanner(System.in);
        int[] genreCount = new int[6];

        PrintWriter writer = new PrintWriter("FavoriteGenres.txt");

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter your favorite song genre for day " + (i+1) + ": ");
            String genre = scanner.nextLine().toLowerCase();

            switch (genre) {
                case "pop":
                    genreCount[0]++;
                    break;
                case "rock":
                    genreCount[1]++;
                    break;
                case "hip hop":
                    genreCount[2]++;
                    break;
                case "country":
                    genreCount[3]++;
                    break;
                case "jazz":
                    genreCount[4]++;
                    break;
                case "r&b":
                    genreCount[5]++;
                    break;
                default:
                    System.out.println("Invalid genre. Please choose from: pop, rock, hip hop, country, jazz, or r&b.");
                    i--;
                    break;
            }
            writer.println(genre);
        }
        writer.close();

      
        int maxCount = -1;
        String favoriteGenre = "";
        for (int i = 0; i < genreCount.length; i++) {
            if (genreCount[i] > maxCount) {
                maxCount = genreCount[i];
                switch (i) {
                    case 0:
                        favoriteGenre = "pop";
                        break;
                    case 1:
                        favoriteGenre = "rock";
                        break;
                    case 2:
                        favoriteGenre = "hip hop";
                        break;
                    case 3:
                        favoriteGenre = "country";
                        break;
                    case 4: 
                        favoriteGenre = "jazz";
                        break;
                    case 5:
                        favoriteGenre = "r&b";
                        break;
                }
            }
        }
        System.out.println("\nYour favorite song genre for the week is: " + favoriteGenre);

      
        File file = new File("FavoriteGenres.txt");
        Scanner fileScanner = new Scanner(file);

        System.out.println("\nYour favorite song genres for the week were:");
        while (fileScanner.hasNextLine()) {
            String genre = fileScanner.nextLine();
            System.out.println(genre);
        }
        fileScanner.close();
        scanner.close();
        
      } catch (IOException e) {
        System.out.println("An error occurred while reading/writing the file.");
            e.printStackTrace();
        }  
    }
}
