package com.company;

public class Car implements CarElement{
    CarElement[] elements;

    public Car(){
        elements = new CarElement[] {new Color(), new Type(), new Engine()};
    }


    @Override
    public void bindToCar(CarVisitor carVisitor) {
        for (int i = 0; i < elements.length; i++) {
            elements[i].bindToCar(carVisitor);
        }
        carVisitor.visit(this);
    }
}
