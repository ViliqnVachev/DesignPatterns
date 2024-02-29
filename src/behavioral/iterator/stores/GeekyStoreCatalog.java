package behavioral.iterator.stores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GeekyStoreCatalog {
    private final List<Product> catalog;

    public GeekyStoreCatalog() {
        catalog = new ArrayList<>();
        addItem("Superman Comic", "The best in town", 12.99);
        addItem("Batman Comic", "Very good", 14.99);
        addItem("Hulk", "The best in the world", 12.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);
        catalog.add(product);
    }

    public Iterator getIterator() {
        return new GeekyStoreIterator(catalog);
    }

    private static class GeekyStoreIterator implements Iterator {
        private final List<Product> catalog;
        private int position;

        public GeekyStoreIterator(List<Product> catalog) {
            this.catalog = catalog;
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < catalog.size() && catalog.get(position) != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No such elements");
            }
            return catalog.get(position++);
        }
    }
}
