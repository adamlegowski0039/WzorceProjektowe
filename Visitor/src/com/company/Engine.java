package com.company;

public class Engine implements CarElement{
    @Override
    public void bindToCar(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
