import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean is_loop = true;

        while (is_loop){
            try {
                System.out.print("Enter an Integer number: ");
                number = scanner.nextInt();
                is_loop = false;
            }catch (Exception err){
                scanner.next();
                System.out.print("input wrong data type: ");
            }
        }



        System.out.print("u input numver = " + number);
    }
}
