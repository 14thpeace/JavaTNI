import java.util.Scanner;

public class Ex402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first message: ");
        String msg1 = scanner.nextLine();
        System.out.print("Enter the second message: ");
        String msg2 = scanner.nextLine();

        System.out.print("Sensitive");
        if (msg1.equals(msg2)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }

        System.out.print("Insensitive");
        if (msg1.equalsIgnoreCase(msg2)){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
