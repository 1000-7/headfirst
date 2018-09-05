package headfirst.factory.pizza.three;

import headfirst.factory.pizza.Pizza;

public abstract class PizzaStore {
    Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
