import java.util.Scanner;

public class Lab305 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first  number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();


        for (int i = num1; i <= num2; i++) {
            i++;
            System.out.print(i  + " ");
        }



    }
}
