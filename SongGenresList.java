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
