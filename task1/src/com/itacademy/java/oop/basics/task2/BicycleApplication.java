package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(0, 0);
        MountainBike mountainBike2 = new MountainBike(19, 0);
        MountainBike mountainBike1 = new MountainBike(10, 48);
        RoadBike roadBike = new RoadBike(9, 0);
        RoadBike roadBike2 = new RoadBike(1, 0);
        RoadBike roadBike1 = new RoadBike(5, 24);

        mountainBike.changeGear(2);
        mountainBike.changeGear(-1);
        mountainBike.changeGear(1);
        mountainBike2.changeGear(1);
        mountainBike2.changeGear(1);

        mountainBike.speedUp(-1);
        mountainBike.speedUp(89);
        mountainBike.speedUp(12);
        mountainBike.speedUp(11);
        mountainBike.speedUp(1);
        mountainBike.speedUp(0);

        mountainBike.applyBrakes(-2);
        mountainBike.applyBrakes(101);
        mountainBike.applyBrakes(9);
        mountainBike.applyBrakes(0);
        mountainBike.applyBrakes(2);


        roadBike.changeGear(2);
        roadBike.changeGear(1);
        roadBike.changeGear(1);
        roadBike.changeGear(0);
        roadBike.changeGear(-2);
        roadBike2.changeGear(-2);
        roadBike2.changeGear(1);
        roadBike2.changeGear(5);

        roadBike.speedUp(-1);
        roadBike.speedUp(89);
        roadBike.speedUp(50);

        roadBike.applyBrakes(15);
        roadBike.applyBrakes(-101);
        roadBike.applyBrakes(-9);

        System.out.println(Speedometer.chooseWinner(mountainBike1, roadBike1));
        System.out.println(Speedometer.chooseWinner(1, 43));
        System.out.println(Speedometer.chooseWinner(51, 51));
    }
}
