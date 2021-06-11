package com.company;

public class Main {

    public static void main(String[] args) {
        Car Car = new CarBuilder()
                .setSpeed(250)
                .setModel("m3")
                .fromNation("bmw")
                .withAcceleration(100)
                .build();
        System.out.println(car.getModel());
    }
}
