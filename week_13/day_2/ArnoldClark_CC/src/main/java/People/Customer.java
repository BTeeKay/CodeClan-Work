package People;

import behaviours.IVehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private float cash;
    private ArrayList<IVehicle> cars;

    public Customer(String name, float cash, ArrayList<IVehicle> cars) {
        this.name = name;
        this.cash = cash;
        this.cars = cars;
    }

    public float getCash() {
        return cash;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }

    public ArrayList<IVehicle> getCars() {
        return cars;
    }

    public void setCars(ArrayList<IVehicle> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
