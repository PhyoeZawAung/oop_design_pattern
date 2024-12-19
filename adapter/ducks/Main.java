package adapter.ducks;

import adapter.ducks.challenge.Drone;
import adapter.ducks.challenge.DroneAdapter;
import adapter.ducks.challenge.SuperDrone;

public class Main {
    public static void main(String[] args) {
        Duck mallerDuck = new MallerDuck();

        Turkey wildTurkey = new WildTurkey();

        Duck duckAdapter = new DuckAdapter(wildTurkey);

        makeDuckAction(mallerDuck);
        makeDuckAction(duckAdapter);

        Turkey turkeyAdapter = new TurkeyAdapter(mallerDuck);

        makeTurkeyAction(wildTurkey);
        makeTurkeyAction(turkeyAdapter);

        Drone drone = new SuperDrone();

        Duck droneAdapter = new DroneAdapter(drone);

        makeDuckAction(droneAdapter);

    }

    public static void makeDuckAction(Duck duck){
        duck.quack();
        duck.fly();
    }

    public static void makeTurkeyAction(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
