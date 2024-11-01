package main.java;

import main.java.menus.CafeMenu;
import main.java.menus.DessertMenu;
import main.java.menus.DinerMenu;
import main.java.menus.PancakeHouseMenu;

public class Main {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        DessertMenu dessertMenu = new DessertMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, dessertMenu, cafeMenu);
        waitress.printMenu();
    }
}
