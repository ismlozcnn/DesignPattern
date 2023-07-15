public class MediaAdapter extends MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audiType) {
        if (audiType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audiType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        } else {
            System.out.println("You have entered a type that does not match! ");
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        } else {
            System.out.println("You have entered a type that does not match!");
        }
    }
}
