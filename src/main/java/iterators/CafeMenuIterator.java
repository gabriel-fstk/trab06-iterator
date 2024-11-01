package main.java.iterators;

import main.java.MenuItem;
import java.util.HashMap;
import java.util.Map;


public class CafeMenuIterator implements Iterator {
    private java.util.Iterator<Map.Entry<String, MenuItem>> iterator;

    public CafeMenuIterator(HashMap<String, MenuItem> items) {
        this.iterator = items.entrySet().iterator();
    }
    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
    @Override
    public MenuItem next() {
        return iterator.next().getValue();
    }
}
