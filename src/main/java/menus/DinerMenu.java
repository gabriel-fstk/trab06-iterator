package main.java.menus;

import java.util.ArrayList;

import main.java.MenuItem;
import main.java.iterators.Iterator;
import main.java.iterators.DinerMenuIterator;

public class DinerMenu implements Menu {
    private static final int MAX_ITEMS = 6;
    private ArrayList<MenuItem> menuItems;
    // private int numberOfItems = 0;

    public DinerMenu() {
        menuItems = new ArrayList<>();
        addItem("Hambúrguer Vegano", "Hambúrguer com vegetais frescos", true, 3.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        if (menuItems.size() >= MAX_ITEMS) {
            System.out.println("Limite de itens alcançado!");
            return;
        }
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
