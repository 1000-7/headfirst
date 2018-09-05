package headfirst.iterator.menu.first;

import headfirst.iterator.menu.three.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems= new ArrayList<>();
        addItem("as","asd",true,0.1);
        addItem("as","asd",true,0.1);
        addItem("as","asd",true,0.1);

    }

    private void addItem(String a,String b,Boolean c,double d) {
        MenuItem menuItem = new MenuItem(a,b,c,d);
        menuItems.add(menuItem);
    }

    public PancakeHouseMenu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }



}
