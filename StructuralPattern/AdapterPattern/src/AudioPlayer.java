public class AudioPlayer extends  MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 fileName: "+fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }else{
            System.out.println("You have entered a type that does not match! ");
        }
    }
}
