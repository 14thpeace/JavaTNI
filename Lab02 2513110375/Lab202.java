import java.util.ArrayList;

public class Lab202 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 0; i < initial_numbers.length; i++) {
            numbers.add(initial_numbers[i]);
        }

        numbers.add(24);

        numbers.add(2, 24);

        numbers.remove(4);

        numbers.set(3, 10);

        System.out.println("Length = " + numbers.size());
        System.out.println("All elements = " + numbers);

    }

}
