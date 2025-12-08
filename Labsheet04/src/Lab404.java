import java.util.Scanner;

public class Lab404 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word;
        String result = "";

        while (true) {
            System.out.print("Enter word: ");
            word = sc.next();

            if (word.equalsIgnoreCase("stop")) {
                break;
            }

            result = result + word + " ";
        }

        System.out.println(result.trim());
    }
}
