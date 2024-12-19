package command.multiple_btn_remote;

public class Stereo {

    String location = "";

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " stereo on");
    }

    public void off(){
        System.out.println(this.location + " stereo off");
    }

    public void setCD(){
        System.out.println(this.location + " stereo setting set to CD");
    }

    public void setDVD(){
        System.out.println(this.location + " stereo setting set to DVD");
    }

    public void setRadio(){
        System.out.println(this.location+ " stereo setting set to Radio");
    }

    public void setVolume(int volume){
        System.out.println(this.location + " stereo volume set to " + volume);
    }
}
