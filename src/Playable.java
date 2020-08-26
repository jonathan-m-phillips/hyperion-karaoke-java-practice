import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public interface Playable {
    public void play(Album album) throws IOException, InterruptedException;
    public void play(Song song) throws IOException, InterruptedException;
}
