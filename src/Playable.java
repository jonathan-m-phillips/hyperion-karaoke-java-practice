import java.util.Arrays;
import java.util.List;

public interface Playable {
    Playable playable = new Playable() {
        public void play() {
            new Album("Empty", Arrays.asList(new Song("Empty", "Empty", Song.parseLyrics("empty"))));
            new Song("Empty", "Empty", Song.parseLyrics("Empty"));
        }
    };
}
