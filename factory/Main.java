package factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore store = new YangonPizzaStore();

        Pizza pizza = store.orderPizza("cheese");


        PizzaStore mandalaystore = new MandalayPizzaStore();

        mandalaystore.orderPizza("cheese");

    }
}
