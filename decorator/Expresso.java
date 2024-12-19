package decorator;

public class Expresso extends Beverage{

    public Expresso(){
        super.description = "The best expresso";
    }

    public float cost(){
        return 1.99f;
    }
}
