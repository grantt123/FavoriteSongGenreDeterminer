//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: Main.java
// Description: This is where the main file of FavoriteSongGenre gets outputted into the console via the try catch method
//*********************************************

import java.io.IOException;

public class Main {
     public static void main(String[] args) {
        try {
            FavoriteSongGenre songGenre = new FavoriteSongGenre();
            songGenre.collectFavoriteGenres();
        } catch (IOException e) {
            System.out.println("An error occurred while reading/writing the file.");
            e.printStackTrace();
        }
    }
}
