package headfirst.template.coffee_tea.three;

public abstract class Beverage {
    void prepareRecipe(){
        boidWater();
        brew();
        pourInCup();
        addConditions();
    }

    protected abstract void addConditions();

    protected abstract void brew();

    void boidWater() {
        System.out.println("water water");
    }

    void pourInCup() {
        System.out.println("pour");
    }
}
