package command.multiple_btn_remote;

public class TV {
    String location = "";

    public TV(String location){
        this.location = location;
    }

    public void on(){
        System.out.println(location + " TV on");
    }

    public void off() {
        System.out.println(location + " TV off");
    }
}
