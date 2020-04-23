package com.codecool.car_race;

import java.util.Random;

public abstract class Vehicle implements Conditions{
    Random rand = new Random();
    int normalSpeed;
    String name;
    int distanceTraveled;
    int motorcycleNumber;
    int breakDownTurnsLeft;

    /**
     * Prepare vehicle for lap
     */
    abstract void prepareForLap();

    /**
     * Move vehicle for an hour
     */
    abstract void moveForAnHour();

    /**
     * Checks if is raining when number is below 30%
     * @return true or false if is raining
     */
    @Override
    public boolean isRaining() {
        int chance = rand.nextInt(100);
        return chance <= 30;
    }

    /**
     * Checks if is a broken truck when number is below 5%
     * @return true or false if is a broken truck
     */
    @Override
    public boolean isThereABrokenTruck() {
        int chance = rand.nextInt(100);
        return chance <= 5;
    }
}
