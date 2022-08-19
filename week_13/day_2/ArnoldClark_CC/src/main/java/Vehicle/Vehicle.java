package Vehicle;

public abstract class Vehicle {

    private int wheels;
    private int doors;
    private String colour;
    private float price;

    public Vehicle(int wheels, int doors, String colour, float price) {
        this.wheels = wheels;
        this.doors = doors;
        this.colour = colour;
        this.price = price;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
