package main.java.menus;

import main.java.MenuItem;
import main.java.iterators.Iterator;
import main.java.iterators.CafeMenuIterator;
import java.util.HashMap;

public class CafeMenu implements Menu {
    private HashMap<String, MenuItem> menuItems;

    public CafeMenu() {
        menuItems = new HashMap<>();
        addItem("Caf� Expresso", "Caf� forte e concentrado", true, 1.99);
        addItem("Caf� com Leite", "Caf� misturado com leite", true, 2.99);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator createIterator() {
        return new CafeMenuIterator(menuItems);
    }
}
