package com.codecool.car_race;


public class Truck extends Vehicle {

    /**
     * Set speed and truck name
     */
    Truck() {
        normalSpeed = 100;
        name = Integer.toString(rand.nextInt(1000));
    }

    /**
     * Prepare truck for lap
     * If there is a broken truck then truck doesn't move for 2 laps
     */
    @Override
    void prepareForLap() {
        if (isThereABrokenTruck()) {
            breakDownTurnsLeft = 2;
            normalSpeed = 0;
        }
    }

    /**
     * Distance traveled is increased when the truck is not broken anymore
     */
    @Override
    void moveForAnHour() {
        if (breakDownTurnsLeft != 0) {
            breakDownTurnsLeft -= 1;
        } else {
            normalSpeed = 100;
            distanceTraveled += normalSpeed;
        }
    }

}

