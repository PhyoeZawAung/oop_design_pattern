package adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobbling");
    }

    public void fly() {
        System.out.println("Fly a short distance");
    }
}
