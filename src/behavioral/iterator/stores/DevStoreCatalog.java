package behavioral.iterator.stores;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DevStoreCatalog {

    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    private final Product[] catalog;

    public DevStoreCatalog() {
        catalog = new Product[MAX_ITEMS];
        addItem("Java is the best", "T-shirt", 20);
        addItem("Java book", "book", 24);
        addItem("LAME", "hoodie", 40);

    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name, description, price);

        if (numberOfProducts >= MAX_ITEMS) {
            System.out.println("Catalog is full");
        } else {
            catalog[numberOfProducts] = product;
            numberOfProducts += 1;
        }

    }

    public Iterator getIterator() {
        return new DevStoreIterator(catalog);
    }

    private static class DevStoreIterator implements Iterator {

        private final Product[] catalog;
        private int position;

        public DevStoreIterator(Product[] catalog) {
            this.catalog = catalog;
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < catalog.length && catalog[position] != null;
        }

        @Override
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No such elements");
            }
            return catalog[position++];
        }
    }
}
