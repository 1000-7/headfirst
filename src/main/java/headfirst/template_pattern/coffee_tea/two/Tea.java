package headfirst.template_pattern.coffee_tea.two;

public class Tea extends Beverage {
    @Override
    void prepareRecipe() {
        boidWater();
        pourInCup();
        addLemon();
    }

    void addLemon(){

    }
}
