import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Search {

    public Boolean linerarSearch(ArrayList<Integer> array, int search_number) {
        for (int i = 0; i < array.size(); i++) {
            if (number == search_number) {
                return true;
            }
        }
        return false;
    }

    public static Boolean binarySearch(ArrayList<Integer> array, int search_number) {
        if (array.size() == 0) {
            return false;
        }

        int midIndex = 0;
        if (array.size() > 1) {
            midIndex = (int) Math.ceil((double) array.size() / 2);
        }

        int midPoint = array.get(midIndex);

        if (search_number == midPoint) {
            return true;
        }

        ArrayList<Integer> newSearchArea;

        if (search_number < midPoint) {
            newSearchArea = new ArrayList<Integer>(array.subList(0, midIndex));
        }
        else {
            newSearchArea = new ArrayList<Integer>(array.subList(midIndex + 1, array.size()));
        }

        return binarySearch(newSearchArea, search_number);
    }
}
