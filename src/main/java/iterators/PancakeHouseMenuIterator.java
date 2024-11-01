package main.java.iterators;

import main.java.MenuItem;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return position < items.size();
    }
    @Override
    public MenuItem next() {
        return items.get(position++);
    }
}

