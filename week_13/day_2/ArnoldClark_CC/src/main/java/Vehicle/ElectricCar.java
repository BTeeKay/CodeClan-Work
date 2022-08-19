package Vehicle;

import behaviours.IVehicle;

public class ElectricCar extends Vehicle implements IVehicle {

    public ElectricCar(int wheels, int doors, String colour, float price) {
        super(wheels, doors, colour, price);
    }

    public String drive() {
        return "electric buzz";
    }
}
