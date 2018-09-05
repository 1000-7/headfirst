package headfirst.iterator.menu.four;

import headfirst.iterator.menu.three.MenuItem;

import java.util.Hashtable;

public class CafeMenu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("as", "asd", true, 0.1);
        addItem("as", "asd", true, 0.1);
        addItem("as", "asd", true, 0.1);
    }

    private void addItem(String as, String asd, boolean b, double v) {
        MenuItem menuItem = new MenuItem(as, asd, b, v);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getMenuItems() {
        return menuItems;
    }
}
