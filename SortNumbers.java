import java.util.ArrayList;
import java.util.Collections;

public class SortNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(5);
        numbers.add(89);
        numbers.add(12);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted (Asc): " + numbers);

        Collections.reverse(numbers);
        System.out.println("Sorted (Desc): " + numbers);
    }
}
