package com.itacademy.java.oop.basics.task2;

public class Speedometer {
//TODO: is good part to inicialize Bike winner? winner = Bike.UNKNOWN or should be something else when result is equal?

    static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        Bike winner;
        if (mountainBike.getSpeed() > roadBike.getSpeed()) {
            winner = Bike.MOUNTAIN;
        } else if (mountainBike.getSpeed() < roadBike.getSpeed()) {
            winner = Bike.ROAD;
        }else {
            winner = Bike.UNKNOWN;
        }
        return winner;
    }


    static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        Bike winner;
        if (mountainBikeSpeed > roadBikeSpeed) {
            winner = Bike.MOUNTAIN;
        } else if (mountainBikeSpeed < roadBikeSpeed) {
            winner = Bike.ROAD;
        }else{
            winner = Bike.UNKNOWN;
        }
        return winner;
    }

}
