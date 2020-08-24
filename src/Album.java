import java.util.Collections;
import java.util.List;

public class Album {
    private String name;
    private List<Object> songs;

    public Album(String name, List<Object> songs) {
        this.name = name;
        this.songs = songs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Object> getSongs() {
        return songs;
    }

    public void setSongs(List<Object> songs) {
        this.songs = songs;
    }

    public void printTrackListings () {
        System.out.printf("%s track listing...", name);
        int count = 1;
        for (Object tracks : songs) {
            System.out.printf("\n%d. %s by %s", count, tracks);
        }
    }

    public static void main(String[] args) {
        Song song1 = new Song("Last Night's Makeup", "Josh Ward", Song.parseLyrics("Watching you wakeup in last night's makeup"));
        Album album = new Album("Holding Me Together", Collections.singletonList(song1.getTitle()));
        album.printTrackListings();
    }
}
