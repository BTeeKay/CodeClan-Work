public class Bicycle implements Imove, Istop {
    private int distanceTravelled;

    public Bicycle() {
        this.distanceTravelled = 0;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void move(int d) {
        this.distanceTravelled += d;
    }

    public String stop() {
        return "I have stopped";
    }
}

