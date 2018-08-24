package headfirst.iterator_pattern.menu.four;


import headfirst.iterator_pattern.menu.three.DinerMenu;
import headfirst.iterator_pattern.menu.three.MenuItem;
import headfirst.iterator_pattern.menu.three.PancakeHouseMenu;

import java.util.Iterator;

public interface Menu {
    Iterator createIterator();
    void printMenu(Iterator iterator);
}
