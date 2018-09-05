package headfirst.factory.pizza.two;

import headfirst.factory.pizza.Pizza;

public class PizzaStore {
    SimpleFactory simpleFactory;

    public PizzaStore(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = simpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
