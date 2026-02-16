package Banking;

import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String id = sc.next();

        AccountTransaction acc = new AccountTransaction(id);

        if (!acc.hasAccountId()) {
            System.out.println("Bank account not found...");
            return;
        }

        int menu;
        do {
            System.out.println("\nPress 1 to deposit");
            System.out.println("Press 2 to withdraw");
            System.out.println("Press 3 to check balance");
            System.out.println("Press 4 to exit");
            System.out.print("\nEnter a menu: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    System.out.println("Your balance = " + acc.checkBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    System.out.println("Your balance = " + acc.checkBalance());
                    break;

                case 3:
                    System.out.println("Your balance = " + acc.checkBalance());
                    break;
            }
        } while (menu != 4);
    }
}
