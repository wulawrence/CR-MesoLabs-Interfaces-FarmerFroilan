package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public String makeNoise() {
        return "Chuga chuga";
    }

    public void canRide() {

    }
}