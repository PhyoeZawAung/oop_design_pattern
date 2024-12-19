package factory;

import factory.ingredients.IngredientFactory;
import factory.ingredients.MandalayPizzaIngredientFactory;

public class MandalayPizzaStore extends PizzaStore{
    IngredientFactory mandalayIngredientFactory = new MandalayPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza(mandalayIngredientFactory);
        }else if(type.equals("greek")){
            pizza = new GreekPizza(mandalayIngredientFactory);
        }else if(type.equals("burmese")){
            pizza = new BurmesePizza(mandalayIngredientFactory);
        }

        return pizza;
    }
}
