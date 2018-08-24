package headfirst.strategy_pattern.duck.one;

public abstract class Duck {
    public void quack() {  //呱呱叫
        System.out.println("呱呱叫");
    }

    public void swim() {   //游泳
        System.out.println(" 游泳");
    }

    public abstract void display(); /*因为外观不一样，让子类自己去决定了。*/
}