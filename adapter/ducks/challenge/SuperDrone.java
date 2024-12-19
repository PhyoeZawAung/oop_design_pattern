package adapter.ducks.challenge;

public class SuperDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("Super drone is beeping");
    }

    @Override
    public void spin_motors() {
        System.out.println("Drone motors spinning");
    }

    @Override
    public void take_off() {
        System.out.println("Drone take off from the ground");
    }
}
