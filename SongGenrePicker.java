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
