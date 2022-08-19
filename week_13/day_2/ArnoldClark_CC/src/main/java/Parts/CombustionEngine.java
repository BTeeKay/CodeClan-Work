package Parts;

public class CombustionEngine {

    private double size;
    private String fuel;

    public CombustionEngine(double size, String fuel) {
        this.size = size;
        this.fuel = fuel;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
