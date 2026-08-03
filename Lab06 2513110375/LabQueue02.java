import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some message: ");
        String message = input.next();

        System.out.println();
        System.out.println("Check Palindrome by Deque = "
                + (checkByDeque(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Check Palindrome by Stack = "
                + (checkByStack(message.toLowerCase()) ? "Palindrome" : "Not Palindrome"));

    }

    public static boolean checkByDeque(String message) {
        Deque<Character> letters = new ArrayDeque<Character>();

        // write your code below here
        for (int i = 0; i < message.length(); i++) {
            letters.offerLast(message.charAt(i));
        }

        while (letters.size() > 1) {
            if (!letters.pollFirst().equals(letters.pollLast())) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new ArrayDeque<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();

        // write your code below here
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            queue.offer(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

}