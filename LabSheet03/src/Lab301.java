import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Integer number: ");
        int num = scan.nextInt();


        if (num > 0){
            System.out.print(num % 2 == 0 ? "This number Even and Positive number" : "This number is Odd and Positive number.");
        }
        else if (num < 0){
            System.out.print(num % 2 == 0 ? "This number Even and Negative number" : "This number is Odd and Negative number.");
        }
        else {
            System.out.print("This is Zero number.");
        }



    }
}
