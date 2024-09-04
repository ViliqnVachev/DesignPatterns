package behavioral.visitor;

import behavioral.visitor.visitors.IVisitor;

public class Jacket extends Clothes {
    public Jacket(String color, double price) {
        super(color, price);
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
