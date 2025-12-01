import javax.swing.*;
import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int x = scan.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y = scan.nextInt();
        if ( x == 0 || y ==0)
        {
            System.out.print("The coordinate point (0,0) lies in the Origin");
        }
        else if ( x >= 1 && y >= 1)
        {
            System.out.print("The coordinate point (" + x +","+ y + ") lies in the First quadrant");
        }
        else if ( x <= -1 && y <= -1)
        {
            System.out.print("The coordinate point (" + x +","+ y + ") lies in the Third quadrant");
        }
        else if ( x >= 1 && y <= -1)
        {
            System.out.print("The coordinate point (" + x +","+ y + ") lies in the Fourt quadrant");
        }
        else
        {
            System.out.print("The coordinate point (" + x +","+ y + ") lies in the second quadrant");
        }
    }
}