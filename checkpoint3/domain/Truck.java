package Devoteam.Checkpoints.checkpoint3.domain;

public class Truck extends Vehicle {

    public Truck(Automaker automaker, String model, String color, int year, VehicleTypeEnum vehicleType) {
        super(automaker, model, color, year, vehicleType);
    }
}
//     @Override
//     public VehicleTypeEnum getVehicleType() {
//         return VehicleTypeEnum.TRUCK;
//     }

// }