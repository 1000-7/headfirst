package headfirst.iterator.menu.three;


import java.util.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("as","asd",true,0.1);
        addItem("as","asd",true,0.1);
        addItem("as","asd",true,0.1);
    }

    private void addItem(String a, String b, Boolean c, double d) {
        MenuItem menuItem = new MenuItem(a, b, c, d);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("menu is full");
        } else {
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
