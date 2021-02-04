package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {

    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == -1 || newGear == -2) {
            if (gear == 0) {
                System.out.println("Gear is already in neutral");
            }else if(gear == 1 && newGear == -2){
                System.out.println("Can not change gear by -2. Only by -1. Gear is at 1 position.");
            } else {
                gear += newGear;
                System.out.println("Gear changed to " + gear);
            }
        } else if (newGear == 1 || newGear == 2) {
            if (gear == 10) {
                System.out.println("Gear is already at maximum");
            } else if(gear == 9 && newGear == 2){
                System.out.println("Can not change gear by 2. Only by 1. Gear is already at 9 position.");
            }
            else {
                gear += newGear;
                System.out.println("Gear changed to " + gear);
            }
        } else {
            System.out.println("Value, can't be " + newGear + ". Value can be only 1, 2 or -1, -2.");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment < 0) {
            System.out.println("Can't use negative values. Please be positive.");
        } else {
            if (speed + increment > 50) {
                System.out.println("Could not do speed more than 50.");

                int counter = 0;
                for (int i = speed; i < 50; ++i) {
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
        if (appBreak > 0) {
            System.out.println("Can't use Positive values for braking. Please use negative values.");
        } else {
            if (speed + appBreak < 0) {
                System.out.println("Can't break so hard.");

                int counter = 0;
                for (int i = speed; i > 0; --i) {
                    ++counter;
                }
                if (counter > 0) {
                    System.out.println("Maximum available breaking is " + (counter * (-1)));
                }

            } else {
                speed += appBreak;
                System.out.println("Current speed is " + speed);
            }
        }
    }
}
