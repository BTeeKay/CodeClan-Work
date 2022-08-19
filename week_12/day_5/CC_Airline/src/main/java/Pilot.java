public class Pilot extends Person {

    private PilotRank rank;
    private int licenceNumber;

    public Pilot(String first, String last, PilotRank rank, int num) {
        super(first, last);
        this.rank = rank;
        this.licenceNumber = num;
    }

    public PilotRank getRank() {
        return this.rank;
    }

    public int getLicenceNumber() {
        return this.licenceNumber;
    }

    public void setRank( PilotRank rank ) {
        this.rank = rank;
    }

    public void setLicenceNumber( int num ) {
        this.licenceNumber = num;
    }

    public String fly() {
        return "Flight In Progress";
    }
}
