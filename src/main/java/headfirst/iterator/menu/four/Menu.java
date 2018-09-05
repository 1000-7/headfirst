package headfirst.iterator.menu.four;


import java.util.Iterator;

public interface Menu {
    Iterator createIterator();
    void printMenu(Iterator iterator);
}
