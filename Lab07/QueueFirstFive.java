import java.util.ArrayDeque;
import java.util.Queue;
 
public class QueueFirstFive {
 
    public static void main(String[] args) {
        Queue<Integer> n_queue = new ArrayDeque<Integer>();
        for (int i = 101; i <= 110; i++) {
            n_queue.offer(i);
        }
        
        System.out.println("Queue => " + n_queue);
        int size = n_queue.size();
        for (int i = 0; i < size; i++) {
            int data = n_queue.poll();
            if (i < 5) {
                System.out.println(data);
            }
            n_queue.offer(data);
        }
        System.out.println("Queue => " + n_queue);
    }
 
}