package main.java.menus;

import main.java.MenuItem;
import main.java.iterators.Iterator;
import main.java.iterators.PancakeHouseMenuIterator;
import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("Panqueca Simples", "Panqueca com ovos e leite", true, 2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
