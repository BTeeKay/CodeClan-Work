public class Plane {

    private final String name;
    private int capacity;
    private float weight;

    public Plane(String name, int cap, float w) {
        this.name = name;
        this.capacity = cap;
        this.weight = w;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public float getWeight() {
        return this.weight;
    }

    public void decreaseCapBy1() {
        if (this.capacity > 0) {
            this.capacity -= 1;
        }
    }

    public void increaseCapBy1() {
        this.capacity += 1;
    }
}
