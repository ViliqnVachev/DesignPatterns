package behavioral.visitor;

import behavioral.visitor.visitors.IVisitor;

public class TShirt extends Clothes {
    TShirt(String color, double price) {
        super(color, price);
    }



    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
