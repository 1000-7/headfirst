package headfirst.factory.pizza.three;

import headfirst.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYCheesePizza();
        }
        return null;
    }
}
