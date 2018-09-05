package headfirst.factory.pizza.one;

import headfirst.factory.pizza.CheesePizza;
import headfirst.factory.pizza.ClamPizza;
import headfirst.factory.pizza.Pizza;
import headfirst.factory.pizza.VeggiePizza;

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
