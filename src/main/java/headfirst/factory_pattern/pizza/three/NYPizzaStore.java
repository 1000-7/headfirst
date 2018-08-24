package headfirst.factory_pattern.pizza.three;

import headfirst.factory_pattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        return null;
    }
}
