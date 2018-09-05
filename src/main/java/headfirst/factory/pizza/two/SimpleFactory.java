package headfirst.factory.pizza.two;

import headfirst.factory.pizza.CheesePizza;
import headfirst.factory.pizza.ClamPizza;
import headfirst.factory.pizza.Pizza;
import headfirst.factory.pizza.VeggiePizza;

public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
