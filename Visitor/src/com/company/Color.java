package com.company;

public class Color implements CarElement{
    @Override
    public void bindToCar(CarVisitor carVisitor) {
        carVisitor.visit(this);
    }
}
