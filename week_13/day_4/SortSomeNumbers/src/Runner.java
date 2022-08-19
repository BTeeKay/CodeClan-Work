public class Runner {
    public static void main(String[] args) {
        // creating an unordered array
        int [] unorderedArray = new int [] {66, 5, 2, 68, 45, 12, 99};
        // create a variable to hold value for swapping
        int temp = 0;
        // setup two for loops to compare to numbers together
        // and swap their places if the number on the left is less than the number on the right
        for (int i = 0; i < unorderedArray.length; i++){
            for (int j = 0; j < unorderedArray.length; j++) {
                if (unorderedArray[i] < unorderedArray[j]) {
                    temp = unorderedArray[i];
                    unorderedArray[i] = unorderedArray[j];
                    unorderedArray[j] = temp;
                }
            }
        }
        // print out array to show it has worked
        for (int i = 0; i < unorderedArray.length; i++) {
            System.out.println(unorderedArray[i]);
        }
    }
}
