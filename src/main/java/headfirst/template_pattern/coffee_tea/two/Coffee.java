package headfirst.template_pattern.coffee_tea.two;

public class Coffee extends Beverage {
    @Override
    void prepareRecipe() {
        boidWater();
        pourInCup();
        addSuger();
    }

    void addSuger(){

    }
}
