package decorator;

public class Decaf extends Beverage{

    public Decaf(){
        description = "the be decaf";
    }

    @Override
    public float cost() {
        return 1.05f;
    }
}
