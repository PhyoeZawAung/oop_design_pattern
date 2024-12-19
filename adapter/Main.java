package adapter;

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
