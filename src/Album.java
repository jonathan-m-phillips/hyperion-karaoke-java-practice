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

}
