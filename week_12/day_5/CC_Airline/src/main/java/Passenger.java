public class Passenger extends Person {

    private int bags;

public Passenger(String first, String last, int bags) {
    super(first, last);
    this.bags = bags;
}

public int getBags() {
    return this.bags;
}

public void setBags(int bags) {
    this.bags = bags;
}

}
