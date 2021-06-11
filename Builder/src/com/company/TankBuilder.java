package com.company;

public class CarBuilder {

    private double maxSpeed;
    private String model;
    private String nation;
    private double acceleration;

    public CarBuilder(String model, String nation, double maxSpeed, double acceleration) {
        this.model = model;
        this.nation = nation;
        this.maxSpeed = maxSpeed;
        this.armor = acceleration;
    }

public CarBuilder(){}
    public CarBuilder setSpeed(double speed) {
        this.maxSpeed = speed;
        return this;
    }

    public CarBuilder fromNation(String nation) {
        this.nation = nation;
        return this;
    }

    public CarBuilder acceleration(double acc) {
        this.acceleration = acc;
        return this;
    }
	public CarBuilder setModel(String name){
        this.model=name;
        return this;
}

    public Car build() {
        return new Car(model, nation, maxSpeed, acceleration);
    }
}
