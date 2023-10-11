//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: SongGenrePicker.java
// Description: This file is where each genre can be picked from, and displays what the software is about.
//*********************************************

public class SongGenrePicker {
  
    private String songGenre = "";

    public SongGenrePicker(String songGenre) {
        this.songGenre = songGenre;
    }

    public String getSongGenre() {
        return this.songGenre;
    }

    public void setSongGenre(String songGenre) {
        this.songGenre = songGenre;
    }
}

class Help {

    public static String about() {

        String about = "This software will take a song genre of your choosing and determine your favorite genre at the end of the current week based on how many times you chose it.";

        return "About the Project: " + "\n" + about + "\n";
    }
}
