package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Car extends Vehicle{
    private String currentName;
    private List<String> names = new ArrayList<>(Arrays.asList("Vertex" ,
            "Might" ,
            "Flux" ,
            "Patron" ,
            "Resolve" ,
            "Whim" ,
            "Origin" ,
            "Chase" ,
            "Prodigy" ,
            "Corsair"));

    /**
     * For each car set random speed and name
     */
    Car(){
        normalSpeed = rand.nextInt((110 - 80) + 1) + 80;
        setCarName();
        name = currentName;
    }

    /**
     * Set car name from names list
     */
    private void setCarName(){
        int firstRandomNumber = rand.nextInt(names.size());
        int secondRandomNumber = rand.nextInt(names.size());
        currentName = names.get(firstRandomNumber) + " " + names.get(secondRandomNumber);
    }

    /**
     * Set speed to 75 if there is a broken truck
     */
    @Override
    void prepareForLap() {
        if(isThereABrokenTruck()){
            normalSpeed = 75;
        }
    }

    /**
     * Increase distance traveled for each lap
     */
    @Override
    void moveForAnHour() {
        distanceTraveled += normalSpeed;
    }
}
