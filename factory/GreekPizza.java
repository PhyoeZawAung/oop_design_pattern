package factory;

import factory.ingredients.IngredientFactory;

public class GreekPizza extends Pizza{
    IngredientFactory ingredientFactory;
    public GreekPizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        name = "CheesePizza";
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
        veggies = ingredientFactory.createVeggies();
        toppings.add("Grated Reggino cheese");
    }

}
