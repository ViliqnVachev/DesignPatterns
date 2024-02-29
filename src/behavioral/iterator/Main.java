package behavioral.iterator;

import behavioral.iterator.stores.DevStoreCatalog;
import behavioral.iterator.stores.GeekyStoreCatalog;

public class Main {
    public static void main(String[] args) {
        DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
        GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
        Seller seller = new Seller(devStoreCatalog, geekyStoreCatalog);
        seller.printCatalog();
    }
}
