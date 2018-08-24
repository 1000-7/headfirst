package headfirst.iterator_pattern.menu.two;

import java.util.List;

public class Menu {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        printMenu(dinerMenuIterator);
        printMenu(pancakeHouseMenuIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getDescription()+" "+menuItem.getPrice());
        }
    }


}
