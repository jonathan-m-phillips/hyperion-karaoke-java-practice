import java.io.IOException;

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

//    void play () throws IOException {
//        Runtime r = Runtime.getRuntime();
//        r.exec("say " + Song.parseLyrics());
//    }

    public static void main(String[] args) throws IOException {
        Song song = new Song("HomeTown girl", "Josh Turner", Song.parseLyrics("She a pretty little homegrown home town girl"));
        MusicPlayer musicPlayer = new MusicPlayer("hi");

//        musicPlayer.play();
    }

}
