package headfirst.factory_pattern.pizza.four;

public class UserOrder {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
