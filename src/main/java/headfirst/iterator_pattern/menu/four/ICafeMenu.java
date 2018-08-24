package headfirst.iterator_pattern.menu.four;

import java.util.Hashtable;
import java.util.Iterator;

public class ICafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();
    @Override
    public Iterator createIterator(){
        return menuItems.values().iterator();
    }

    @Override
    public void printMenu(Iterator iterator) {

    }
}
