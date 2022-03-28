package com.company;

class MountainBicycle extends Bicycle {
    private int seatHeight;

    public MountainBicycle(int gear, int speed,
                           int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public int getHeight() {
        return seatHeight;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nSeat height is "
                + seatHeight);
    }
}

