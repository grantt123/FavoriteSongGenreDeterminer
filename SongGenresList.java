//*********************************************
// Title: Favorite Song Genre Determiner
// Name: Grant Tran
// Course Section: CMIS202-ONL1 (Seidel) Fall 2023
// File: FavoriteSongGenre.java
// Description: This file is where it adapts from the SongGenrePicker class and has the certain song genres
// where the user can choose from.
//*********************************************

import java.util.*;

public class SongGenresList extends SongGenrePicker {
  
    private ArrayList<String> songGenres = new ArrayList<String>(7);

    public SongGenresList(String songGenre) {
        super(songGenre);
    }

    public ArrayList<String> getSongGenres() {
        return this.songGenres;
    }

    public void setSongGenres(ArrayList<String> songGenres) {
        this.songGenres = songGenres;
    }
}
