public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void quack(){
        quackBehaviour.quack();
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        this.flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    public abstract void display();
}
