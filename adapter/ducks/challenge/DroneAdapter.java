package adapter.ducks.challenge;

import adapter.ducks.Duck;

public class DroneAdapter implements Duck {

    Drone drone;

    public DroneAdapter(Drone drone){
        this.drone = drone;
    }

    @Override
    public void quack() {
        this.drone.beep();
    }

    @Override
    public void fly() {
        this.drone.spin_motors();
        this.drone.take_off();
    }
}
