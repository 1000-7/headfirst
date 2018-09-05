package headfirst.decoration.starbuzz.one;

public abstract class Beverage {
    // 饮料描述，比如咖啡、牛奶
    protected String description;

    public String getDescription() {
        return this.description;
    }

    // 饮料价钱
    public abstract float cost();
}

class Coffee extends Beverage {
    public Coffee() {
        description = "Coffee";
    }

    @Override
    public float cost() {
        return 3.2f;
    }
}

class Milk extends Beverage {
    public Milk() {
        description = "Milk";
    }

    @Override
    public float cost() {
        return 4.6f;
    }
}

//每种可能的调味料的饮料
class CoffeeWithMilk extends Beverage {
    @Override
    public float cost() {
        return 7.9f;
    }
}

class MilkWithCoffee extends Beverage {
    @Override
    public float cost() {
        return 8.2f;
    }
}