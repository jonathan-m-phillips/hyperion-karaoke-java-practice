import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public void printTrackListings () {
        System.out.printf("%s track listing...", name);
        int count = 1;
        System.out.println();
        for (Song tracks : songs) {
            System.out.println(tracks.getTitle() + " by " + tracks.getArtist());
            count++;
        }
    }

    public static void main(String[] args) {

        Album TheRoad = new Album("The Road", Arrays.asList(
                new Song("75", "Aaron Lewis", Song.parseLyrics("Drifters like me")),
                new Song("The Road", "Aaron Lewis", Song.parseLyrics("On the road")),
                new Song("Endless Summer", "Aaron Lewis", Song.parseLyrics("This endless summer")),
                new Song("Red, White, & Blue", "Aaron Lewis", Song.parseLyrics("of the red white and blue")),
                new Song("Lessons Learned", "Aaron Lewis", Song.parseLyrics("learning lessons")),
                new Song("Forever", "Aaron Lewis", Song.parseLyrics("forever is a song"))
        ));

        TheRoad.printTrackListings();

    }

}
