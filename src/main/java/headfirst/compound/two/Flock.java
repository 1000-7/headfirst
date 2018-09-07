package headfirst.compound.two;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * simulator里创建了很多Quackable实例，用迭代器和组合模式看成一个集合
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quacks = new ArrayList<>();

    public void add(Quackable quackable) {
        quacks.add(quackable);
    }

    @Override
    public void quack() {
        Iterator iterator = quacks.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.quack();
        }

    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quacks.iterator();
        while (iterator.hasNext()) {
            Quackable quackable = (Quackable) iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {

    }
}
