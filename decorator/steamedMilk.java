package decorator;

public class steamedMilk extends Decorator{
    Beverage beverage;
    public steamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return this.beverage.getDescription() + ", steamed milk";
    }

    public float cost(){
        float cost = 0.15f;
        switch (this.beverage.getSize()){
            case TALL -> cost += 0.01f;
            case GRANDE -> cost += 0.15f;
            case VENTI -> cost +=  0.20f;
        }
        return this.beverage.cost() + cost;
    }
}
