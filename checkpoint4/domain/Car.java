package Devoteam.Checkpoints.checkpoint4.domain;


public class Car extends Vehicle {
//JENS: Waarom 2x dezelfde functie? Niet de bedoeling - 1 houden en overriden als je andere constructor nodig hebt
    public Car(Automaker automaker, String model, String color, int year, VehicleTypeEnum vehicleType) {
        super(automaker, model, color, year, vehicleType);
    }
    public Car(Automaker automaker, String model, String color, int year, VehicleTypeEnum vehicleType, String createdAt) {
        super(automaker, model, color, year, vehicleType, createdAt);
    }
}