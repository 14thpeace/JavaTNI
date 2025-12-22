import java.util.Scanner;
public class Lab604 {

    public static void display_array(int[] numbers) {
        System.out.print("List of numbers in array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static boolean check_index(int[] numbers, int index) {
        if (index >= 0 && index < numbers.length) {
            return true;
        }
        return false;
    }

    public static int input_index(int[] numbers) {
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.print("Enter index: ");
        index = sc.nextInt();
        while (!check_index(numbers, index)) {
            System.out.print("Invalid index!! Enter index, again: ");
            index = sc.nextInt();
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};
        display_array(numbers);
        int index = input_index(numbers);

        System.out.println(
                "\nThe number at index " + index + " is " + numbers[index]
        );

        if (index - 1 >= 0) {
            System.out.println(
                    "The number before index " + index + " is " + numbers[index - 1]
            );
        } else {
            System.out.println(
                    "The number before index " + index + " is Out of range!!"
            );
        }

        if (index + 1 < numbers.length) {
            System.out.println(
                    "The number after index " + index + " is " + numbers[index + 1]
            );
        } else {
            System.out.println(
                    "The number after index " + index + " is Out of range!!"
            );
        }
    }
}