package com.codecool.car_race;

public class VehicleFactory {

    /**
     * Return new vehicle type based on string input
     * @param vehicleType car, truck, motorcycle
     * @return new vehicle
     */
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }
        if(vehicleType.equalsIgnoreCase("MOTORCYCLE")){
            return new Motorcycle();
        }
        if(vehicleType.equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        return null;
    }
}
