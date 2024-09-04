package behavioral.visitor;

import behavioral.visitor.visitors.IVisitor;
import behavioral.visitor.visitors.TaxVisitor;

public class Main {
    public static void main(String[] args) {
        IVisitor visitor = new TaxVisitor();
        Clothes tShirt = new TShirt("green", 20);
        Clothes jacket = new Jacket("black", 20);
        Clothes pants = new Pants("blue", 20);

        System.out.println(tShirt.accept(visitor));
        System.out.println(jacket.accept(visitor));
        System.out.println(pants.accept(visitor));
    }
}
