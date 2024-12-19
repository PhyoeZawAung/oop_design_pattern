package factory;

import factory.ingredients.Dough;
import factory.ingredients.Sauce;
import factory.ingredients.Veggie;
import factory.ingredients.Cheese;
import factory.ingredients.Clam;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public String name = "";
    public Dough dough;
    public Veggie[] veggies;
    public Sauce sauce;
    public Cheese cheese;
    public Clam clam;
    public List<String> toppings = new ArrayList<String>();

    public abstract void prepare();

    public void detail(){
        System.out.println("Adding " + dough.getName());
        System.out.println("Adding " + sauce.getName());
        System.out.println("Adding " + cheese.getName());
        System.out.println("Adding " + clam.getName());
        System.out.println("Adding Veggies...");
        for(Veggie veggie : veggies){
            System.out.println("    " + veggie.getName());
        }

    }
    public void bake(){
        System.out.println("Baking " + name + " Pizza");
    }

    public void cut(){
        System.out.println("Cutting " + name + " Pizza");
    }

    public void box(){
        System.out.println("Put " + name + " Pizza in the box");
    }
}
