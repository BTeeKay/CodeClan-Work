public class CabinCrew extends Person{

    private CabinRank rank;

    public CabinCrew(String first, String last, CabinRank rank) {
        super(first, last);
        this.rank = rank;
    }

    public CabinRank getRank() {

        return this.rank;
    }

    public void setRank(CabinRank rank) {

        this.rank = rank;
    }

    public String seatbelt() {
        return "Please fasten seatbelts";
    }
}
