package factory.ingredients;

public class YangonPizzaIngredientFactory implements IngredientFactory {
    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{
                new Onion(),
                new Garlic(),
                new EggPlant(),
                new RedPepper(),
        };
    }
}
