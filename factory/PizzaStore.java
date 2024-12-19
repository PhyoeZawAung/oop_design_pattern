package factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();

        pizza.detail();

        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println("Your order arrived");

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
