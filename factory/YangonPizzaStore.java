package factory;

import factory.ingredients.IngredientFactory;
import factory.ingredients.YangonPizzaIngredientFactory;

public class YangonPizzaStore extends PizzaStore{

    IngredientFactory yangonIngredientFactory = new YangonPizzaIngredientFactory();
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza(yangonIngredientFactory);
        }else if(type.equals("greek")){
            pizza = new GreekPizza(yangonIngredientFactory);
        }else if(type.equals("burmese")){
            pizza = new BurmesePizza(yangonIngredientFactory);
        }

        return pizza;
    }
}
