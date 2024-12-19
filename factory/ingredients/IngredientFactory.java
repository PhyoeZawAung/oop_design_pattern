package factory.ingredients;

public interface IngredientFactory {
    public Sauce createSauce();
    public Dough createDough();
    public Cheese createCheese();
    public Clam createClam();
    public Veggie[] createVeggies();
}
