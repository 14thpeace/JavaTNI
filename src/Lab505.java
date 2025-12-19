import javax.swing.*;

public class Lab505 {
    public static boolean is_Palindrome(String word) {
        word = word.toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static void main() {
        String palindrome = JOptionPane.showInputDialog("Enter some word:");
        if (is_Palindrome(palindrome)== true) {
            JOptionPane.showMessageDialog(null, palindrome +  " is a palindrome.");
        }
        else {
            JOptionPane.showMessageDialog(null, palindrome +  " is NOT palindrome.");
        }

    }
}
