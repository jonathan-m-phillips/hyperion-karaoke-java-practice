import java.io.IOException;
import static java.lang.Thread.sleep;

public class MusicPlayer extends Player {
    private String voice = "";

    public MusicPlayer(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public void play(Song song) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        sleep(INTRO_PAUSE);
        for (String word : song.getLyrics()) {
            r.exec("say " + word);
            sleep(WORD_CADENCE);
        }
    }

    @Override
    public void play(Album album) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        for (Song song : album.getSongs()) {
            play(song);;
        }
    }

}
