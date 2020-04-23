package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Vehicle> vehicleList = new ArrayList<>();
    private static final int HOURS = 50;

    /**
     * Add all vehicles to vehicleList
     * @param vehicle truck, car, or motorcycle
     */
    void registerRacer(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Simulate race by moving each vehicle for 50 hours
     */
    void simulateRace() {
        for (int i = 0; i < HOURS; i++) {
            for (Vehicle vehicle : vehicleList) {
                vehicle.prepareForLap();
                vehicle.moveForAnHour();
            }
        }
    }

    /**
     * Display results for each vehicle
     */
    void printRaceResults() {
        for (Vehicle vehicle : vehicleList) {
            System.out.println("Vehicle Name: " + vehicle.name + " | " + "Vehicle Distance: " +
                    vehicle.distanceTraveled);
        }
    }

}




