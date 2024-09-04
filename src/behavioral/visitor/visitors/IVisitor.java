package behavioral.visitor.visitors;

import behavioral.visitor.Jacket;
import behavioral.visitor.Pants;
import behavioral.visitor.TShirt;

public interface IVisitor {
    double visit(TShirt tshirt);
    double visit(Jacket jacket);
    double visit(Pants pants);
}
