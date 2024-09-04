package behavioral.visitor.visitors;

import behavioral.visitor.Jacket;
import behavioral.visitor.Pants;
import behavioral.visitor.TShirt;

public class TaxVisitor implements IVisitor {
    @Override
    public double visit(TShirt tshirt) {
        System.out.println("Adding 20% tax for clothes type: " + TShirt.class.getName());
        return (tshirt.getPrice() * .20) + tshirt.getPrice();
    }

    @Override
    public double visit(Jacket jacket) {
        System.out.println("Adding 30% tax for clothes type: " + TShirt.class.getName());
        return (jacket.getPrice() * .30) + jacket.getPrice();
    }

    @Override
    public double visit(Pants pants) {
        System.out.println("Adding 40% tax for clothes type: " + TShirt.class.getName());
        return (pants.getPrice() * .40) + pants.getPrice();
    }
}
