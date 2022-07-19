public class Bottle {

    private int volume;

    public Bottle() {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int drink() {
        return this.volume - 10;
    }

    public int empty() {
        return (this.volume = 0);
    }

    public int fill() {
        return (this.volume = 100);
    }
}
