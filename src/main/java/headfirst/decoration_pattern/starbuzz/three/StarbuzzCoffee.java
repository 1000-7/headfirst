package headfirst.decoration_pattern.starbuzz.three;


public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //任何调料都不加
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        //这一部分可以用生成器方式更好的实现
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Soy(beverage2);
        //加Mocah和Soy
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}

