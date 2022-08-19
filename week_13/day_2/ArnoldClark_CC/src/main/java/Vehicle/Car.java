package Vehicle;


import Parts.CombustionEngine;
import Parts.Gearbox;
import behaviours.IVehicle;

public class Car extends Vehicle implements IVehicle {

    private CombustionEngine engine;
    private Gearbox gearbox;

    public Car(int wheels, int doors, String colour, float price, CombustionEngine engine, Gearbox gearbox) {
        super(wheels, doors, colour, price);
        this.engine = engine;
        this.gearbox = gearbox;
    }

    public String drive() {
        return "Fuel Burning Vroom";
    }
}
