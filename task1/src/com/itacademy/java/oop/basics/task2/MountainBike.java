package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {

    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == -1) {
            if (gear == 0) {
                System.out.println("Gear is already in neutral");
            } else {
                gear += newGear;
                System.out.println("Gear changed to " + gear);
            }
        } else if (newGear == 1) {
            if (gear == 20) {
                System.out.println("Gear is already at maximum");
            } else {
                gear += newGear;
                System.out.println("Gear changed to " + gear);
            }
        } else {
            System.out.println("Value, can't be " + newGear + ". Value can be only 1 or -1.");
        }

    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Can't use negative values. Please be positive.");
        } else {
            if (speed + increment > 100) {
                System.out.println("Could not do speed more than 100.");

                int counter = 0;
                for (int i = speed; i < 100; ++i) {
                    ++counter;
                }

                if (counter > 0) {
                    System.out.println("Maximum available speed increment is " + counter);
                }

            } else {
                speed += increment;
                System.out.println("Current speed is " + speed);
            }
        }
    }

    @Override
    public void applyBrakes(int appBreak) {
        if (appBreak < 0) {
            System.out.println("Can't use negative values for braking. Please use positive values.");
        } else {
            if (speed - appBreak < -11) {
                System.out.println("Can't break so hard.");

                int counter = 0;
                for (int i = speed; i > -10; --i) {
                    ++counter;
                }
                if (counter > 0) {
                    System.out.println("Maximum available breaking is " + counter);
                }

            } else {
                speed -= appBreak;
                System.out.println("Current speed is " + speed);
            }
        }

    }
}
