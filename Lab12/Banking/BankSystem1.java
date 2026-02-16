package Banking;

import java.util.Scanner;

public class BankSystem1 {

    public static String input_account_id(Scanner sc) {
        String id;
        while (true) {
            System.out.print("Enter account id: ");
            id = sc.next();

            if (id.length() == 10 ) {
                return id;
            }
        }
    }

    public static double input_initial_balance(Scanner sc) {
        System.out.println();
        while (true) {
            System.out.print("Enter your initial deposit amount: ");
            if (sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                System.out.print("Try again! ");
                sc.next();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String account_bank = input_account_id(sc);
        double initial_balance = input_initial_balance(sc);

        OpenNewAccount account =
                new OpenNewAccount(account_bank, initial_balance);

        System.out.println(account.recordAccount());
    }
}