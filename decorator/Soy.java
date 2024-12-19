package decorator;

public class Soy extends Decorator{

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        float cost = 0.15f;
        switch (this.beverage.getSize()){
            case TALL -> cost += 0.01f;
            case GRANDE -> cost += 0.15f;
            case VENTI -> cost +=  0.20f;
        }
        return this.beverage.cost() + cost;
    }
}
