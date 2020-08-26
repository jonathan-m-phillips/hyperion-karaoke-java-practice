import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class KaraokeApp {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        String userChoice = null;

        Player musicPlayer = new MusicPlayer("victoria"); // can change the voice
        Player lyricsPlayer = new LyricsPlayer("blue"); // can change the color

        Album a = new Album("90s Hits", Arrays.asList(
           new Song("Every Day is a Winding Road", "Sheryl Crow", Song.parseLyrics("Everyday is a winding road ... I get a little bit closer to feeling fine")),
           new Song("Ready to Go", "Republica", Song.parseLyrics("I'm standing on the rooftops shouting out, Baby, I'm ready to go")),
           new Song("Airbag", "Radiohead", Song.parseLyrics("In an interstellar burst I am back to save the universe"))
        ));

        Album TheRoad = new Album("The Road", Arrays.asList(
                new Song("75", "Aaron Lewis", Song.parseLyrics("Drifters like me")),
                new Song("The Road", "Aaron Lewis", Song.parseLyrics("On the road")),
                new Song("Endless Summer", "Aaron Lewis", Song.parseLyrics("This endless summer")),
                new Song("Red, White, & Blue", "Aaron Lewis", Song.parseLyrics("of the red white and blue")),
                new Song("Lessons Learned", "Aaron Lewis", Song.parseLyrics("learning lessons")),
                new Song("Forever", "Aaron Lewis", Song.parseLyrics("forever is a song"))
        ));


        runKaraokeMachine(scanner, userChoice, musicPlayer, lyricsPlayer, a);

    }

    public static void runKaraokeMachine(Scanner scanner, String userChoice, Player musicPlayer, Player lyricsPlayer, Album a) throws IOException, InterruptedException {
        a.printTrackListings();

        System.out.println("\nWould you like to listen to this album (type 's') or sing karaoke with it (type 'k')? [s/k]");
        do {
            userChoice = scanner.next();
            if (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s")) {
                System.out.println("Must select either 's' or 'k'");
            }
        }
        while (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s"));

        if (userChoice.equalsIgnoreCase("k")) {
            lyricsPlayer.play(a);
        } else {
            musicPlayer.play(a);
        }
    }

}
