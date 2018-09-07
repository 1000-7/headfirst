package headfirst.compound.first;


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
}
