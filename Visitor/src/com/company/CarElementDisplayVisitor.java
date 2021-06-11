package com.company;

public class CarElementDisplayVisitor implements CarVisitor{
    @Override
    public void visit(Car car) {
        System.out.println("Oto samochód");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Oto silnik");
    }

    @Override
    public void visit(Color color) {
        System.out.println("Oto kolor");
    }

    @Override
    public void visit(Type type) {
        System.out.println("Oto typ");
    }
}
