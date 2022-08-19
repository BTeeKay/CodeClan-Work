package People;

import behaviours.IVehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private float till;
    private ArrayList<IVehicle> stock;

    public Dealership(String name, float till, ArrayList<IVehicle> stock) {
        this.name = name;
        this.till = till;
        this.stock = stock;
    }

    public float getTill() {
        return till;
    }

    public void setTill(float till) {
        this.till = till;
    }

    public ArrayList<IVehicle> getStock() {
        return stock;
    }

    public void setStock(ArrayList<IVehicle> stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
