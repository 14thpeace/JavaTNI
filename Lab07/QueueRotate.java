import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
 
public class QueueRotate {
 
    public static Queue<Integer> queue = new ArrayDeque<Integer>();
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        originalQueue();
        int choice;
        do {
            System.out.print("\nPress 1 to rotate queue: ");
            choice = input.nextInt();
            if (choice == 1) {
                rotateQueue();
            }
        } while (choice == 1);
        System.out.println("Exit");
        input.close();
    }
 
    public static void rotateQueue() {
        int first = queue.poll();
        System.out.println("Calling queue: " + first);
        queue.offer(first);
        System.out.println("Queue => " + queue);
    }
 
    public static void originalQueue() {
        for (int i = 101; i <= 107; i++) {
            queue.offer(i);
        }
        System.out.println("Queue => " + queue);
    }
 
}