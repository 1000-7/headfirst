package headfirst.decoration_pattern.starbuzz.three;

public class Soy extends CondimentDecorator {
    Beverage beverage;


    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return beverage.getDescription() + " ,Soy";
    }


    @Override
    public double cost() {
        // TODO Auto-generated method stub
        double cost = beverage.cost();
        //放进size判断
        return cost + 0.30;
    }
}

