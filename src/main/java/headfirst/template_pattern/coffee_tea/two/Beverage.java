package headfirst.template_pattern.coffee_tea.two;

public class Beverage {
    void prepareRecipe(){
        boidWater();
        pourInCup();
    }

    void boidWater() {
        System.out.println("water water");
    }

    void pourInCup() {
        System.out.println("pour");
    }
}
