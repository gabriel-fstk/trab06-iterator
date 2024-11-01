package main.java;

import main.java.menus.Menu;
import main.java.iterators.Iterator;

public class Waitress {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu dessertMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu dessertMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.dessertMenu = dessertMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        System.out.println("MENU\n----\nCAFÉ DA MANHÃ");
        printMenu(pancakeHouseMenu.createIterator());
        System.out.println("\nALMOÇO");
        printMenu(dinerMenu.createIterator());
        System.out.println("\nSOBREMESAS");
        printMenu(dessertMenu.createIterator());
        System.out.println("\nMENU DE CAFÉS");
        printMenu(cafeMenu.createIterator());
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
