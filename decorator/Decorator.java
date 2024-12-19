package decorator;

public abstract class Decorator extends Beverage {
    Beverage beverage;

    public abstract float cost();
}
