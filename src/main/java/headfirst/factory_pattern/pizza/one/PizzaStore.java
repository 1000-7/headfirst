package headfirst.factory_pattern.pizza.one;

import headfirst.factory_pattern.pizza.CheesePizza;
import headfirst.factory_pattern.pizza.ClamPizza;
import headfirst.factory_pattern.pizza.Pizza;
import headfirst.factory_pattern.pizza.VeggiePizza;

public class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
//很难维护
