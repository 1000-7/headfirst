package headfirst.iterator.menu.six;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeMenu= new Menu("pancake","asdas");
        MenuComponent dinerMenu= new Menu("diner","asdas");
        MenuComponent cafeMenu= new Menu("cafe","asdas");
        MenuComponent dessertMenu= new Menu("dessert","asdas");

        MenuComponent allMenus= new Menu("all menu","all is all");

        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("as","sa",true,1));
        dinerMenu.add(dessertMenu);
        dinerMenu.add(new MenuItem("asasda","sa",false,1));
        Waitress waitress = new Waitress(allMenus);
        waitress.print();
        System.out.println("------------");
        waitress.printVegetarianMenu();
    }
}
