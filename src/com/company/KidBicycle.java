package com.company;

public class KidBicycle extends Bicycle {
    private int wheels;

    public KidBicycle(int gear, int speed, int numWheels) {
        super(gear, speed);
        wheels = numWheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nNumbers of wheel: "
                + wheels);
    }
}

