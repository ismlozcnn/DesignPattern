public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();

        audioPlayer.play("mp3","Nilüfer.mp3");
        audioPlayer.play("mp4","Hangimiz Sevmedik.mp4");
        audioPlayer.play("vlc","Yalan.vlc");



    }
}