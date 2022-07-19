import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public int getNumberCount() {
        return this.numbers.size();
    }

    public void addNumbers(int number) {
        this.numbers.add(number);
    }

    public int getNumberAtIndex(int index) {
        return this.numbers.get(index);
    }

    public int getTotal() {
        int total = 0;
        for (int i = 0; i < this.numbers.size(); i++) {
            total += this.numbers.get(i);
        }
        return total;
    }
}
