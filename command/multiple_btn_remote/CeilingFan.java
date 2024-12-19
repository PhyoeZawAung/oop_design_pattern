package command.multiple_btn_remote;

public class CeilingFan {
    public final int HIGH = 3;
    public final int MEDIUM = 2;
    public final int LOW = 1;
    public final int OFF = 0;
    String location = "";
    int speed;


    public CeilingFan(String location) {
        this.location = location;
    }

    public void high(){
        this.speed = HIGH;
        System.out.println(location + " ceiling fan open with high speed");
    }

    public void medium() {
        this.speed = MEDIUM;
        System.out.println(location + " ceiling fan open with medium speed");
    }

    public void low() {
        this.speed = LOW;
        System.out.println(location + " ceiling fan open with low speed");
    }

    public void off() {
        this.speed = OFF;
        System.out.println(location + " ceiling fan open off");
    }

    public int getSpeed() {
        return speed;
    }
}
