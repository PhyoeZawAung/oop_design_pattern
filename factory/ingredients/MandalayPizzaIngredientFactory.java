package factory.ingredients;

public class MandalayPizzaIngredientFactory implements IngredientFactory {
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Veggie[] createVeggies() {

        return new Veggie[]{
                new Onion(), new Garlic(),new Spanich()
        };

    }
}
