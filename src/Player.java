import java.io.IOException;

abstract class Player implements Playable{
    protected final int WORD_CADENCE = 600;
    protected final int INTRO_PAUSE = 3000;

    @Override
    public void play(Song song) throws IOException, InterruptedException {
        song.getLyrics();
    }

    @Override
    public void play(Album album) throws IOException, InterruptedException {

    }
}
