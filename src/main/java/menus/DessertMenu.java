package main.java.menus;

import main.java.MenuItem;
import main.java.iterators.Iterator;
import main.java.iterators.DessertMenuIterator;
import java.util.ArrayList;

public class DessertMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public DessertMenu() {
        menuItems = new ArrayList<>();
        addItem("Bolo de Chocolate", "Delicioso bolo de chocolate com cobertura", true, 4.50);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new DessertMenuIterator(menuItems);
    }
}

