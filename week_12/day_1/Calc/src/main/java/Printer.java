public class Printer {

    int sheets;
    int toner;

    public Printer() {
        this.sheets = 100;
        this.toner = 100;
    }

    public int getSheets() {
        return this.sheets;
    }

    public int getToner() {
        return this.toner;
    }

    public String print(int sheets, int copies) {

        int total = (sheets * copies);

        if (total < this.sheets) {
            this.sheets -= total;
            this.toner -= total;
            return "Print Successful";
        }

        return "Print Unsuccessful";
    }
}
