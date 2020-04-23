package com.codecool.car_race;


public class Motorcycle extends Vehicle {
    private static int counter;

    /**
     * Set speed and name
     */
    Motorcycle(){
        normalSpeed = 100;
        motorcycleNumber = counter++;
        name = "Motorcycle " + motorcycleNumber;
    }

    /**
     * Prepare motorcycle for lap
     * If is raining then speed decreases random between 5 - 50 km
     */
    @Override
    void prepareForLap() {
        int currentSpeed = 100;
        int randomSpeedReduction = rand.nextInt((50 - 5) + 1) + 5;
        if(isRaining()){
            normalSpeed = currentSpeed - randomSpeedReduction;
        }
    }

    /**
     * Increase distance traveled
     */
    @Override
    void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }
}
