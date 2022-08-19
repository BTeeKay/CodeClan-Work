public class Car implements Imove, Istart, Istop {
    private String make;
    private String model;
    private int odometerReading;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
        this.odometerReading = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void move(int d) {
        this.odometerReading += d;
    }

    public String start() {
        return "I have started";
    }

    public String stop() {
        return "I have stopped";
    }
}
