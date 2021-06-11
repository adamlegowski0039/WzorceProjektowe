package com.company;

public interface CarVisitor {
    public void visit(Car car);
    public void visit(Color color);
    public void visit(Engine engine);
    public void visit(Type type);
}
