public class Guest {

    private String firstName;
    private String lastName;
    private String email;

    public Guest(String first, String last, String email) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String n) {
        this.firstName = n;
    }
}
