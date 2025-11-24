import java.util.Scanner;

public class Lab204 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input hour  : ");
        int hour = scan.nextInt();
        System.out.print("Input minute: ");
        int minute = scan.nextInt();
        int total_hour = hour * 60;
        int total_minutes = total_hour + minute;
        System.out.print("Total time is " + total_minutes + " minutes");

    }
}
