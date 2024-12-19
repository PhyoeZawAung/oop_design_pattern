package decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage expresso = new Expresso();
        expresso.setSize(Beverage.Size.VENTI);

        System.out.println(expresso.getDescription() + expresso.cost());
        expresso = new Soy(expresso);
        expresso = new steamedMilk(expresso);
        System.out.println(expresso.getDescription() + expresso.cost());
    }
}
