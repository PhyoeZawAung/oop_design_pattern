package decorator;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "the best house hold";
    }

    public float cost(){
        return 0.89f;
    }
}
