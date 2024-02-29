package behavioral.iterator;

import behavioral.iterator.stores.DevStoreCatalog;
import behavioral.iterator.stores.GeekyStoreCatalog;
import behavioral.iterator.stores.Product;
import java.util.Iterator;

public class Seller {

    private DevStoreCatalog devStoreCatalog;
    private GeekyStoreCatalog geekyStoreCatalog;

    public Seller(DevStoreCatalog devStoreCatalog, GeekyStoreCatalog geekyStoreCatalog) {
        this.devStoreCatalog = devStoreCatalog;
        this.geekyStoreCatalog = geekyStoreCatalog;
    }

    public void printCatalog() {
        print(devStoreCatalog.getIterator());
        System.out.println("================");
        print(geekyStoreCatalog.getIterator());
    }

    private void print(Iterator iterator) {
        while (iterator.hasNext()) {
            Product product = (Product) iterator.next();
            System.out.print(product.getName() + ", ");
            System.out.print(product.getDescription() + ", ");
            System.out.println(product.getPrice());
        }
    }
}
