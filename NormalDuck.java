public class NormalDuck extends Duck{

    public NormalDuck(){
        quackBehaviour = new NormalQuack();
        flyBehaviour = new WindFly();
    }

    public void display(){
        System.out.println("I am normal duck");
    }
}
