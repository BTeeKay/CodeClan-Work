public class Runner {

    public static void main(String[] args) {
        try {
            int one = 1;
            int zero = 0;
            String[] cohort = {"G31", "G32"};
            cohort[3] = "G33";
            System.out.println(one / zero);
        }
        catch(ArithmeticException ex) {
            System.out.println("You tried to " + ex.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array position " + ex.getMessage() + " is out of bounds");
        }
    }
}
