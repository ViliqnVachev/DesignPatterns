package behavioral.visitor;

import behavioral.visitor.visitors.IVisitor;

public interface IVisitable {
    double accept(IVisitor visitor);
}
