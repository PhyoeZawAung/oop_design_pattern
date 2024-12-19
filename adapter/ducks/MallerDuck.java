package adapter.ducks;

public class MallerDuck implements Duck{
    public void quack(){
        System.out.println("Quacking");
    }

    public void fly(){
        System.out.println("Flying");
    }
}
