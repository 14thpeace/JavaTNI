import java.util.ArrayList;
import java.util.Scanner;

public class jumpSearch03 {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree();
        tree.printTree(tree.getRoot(), 0);

        ArrayList<Integer> list = traversal(tree.getRoot());
        System.out.println("\nTraversal order : " + list);

        int[] nums = new int[list.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter target: ");
        int target = input.nextInt();

        int index = jumpSearch(nums, target);
        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this tree");
        }
    }

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        inorder(root, list);
        return list;
    }

    public static void inorder(Node node, ArrayList<Integer> list) {
        if (node != null) {
            inorder(node.left, list);
            list.add(node.data);
            inorder(node.right, list);
        }
    }

    public static int jumpSearch(int[] nums, int target) {
        int jump_size = (int) Math.floor(Math.sqrt(nums.length));
        int start = 0;
        int m = 0;
        while (m < nums.length) {
            if (target == nums[m]) {
                return m;
            } else if (target > nums[m]) {
                start = m;
                m += jump_size;
            } else {
                for (int i = start; i < m; i++)
                    if (target == nums[i])
                        return i;
                return -1;
            }
        }

        for (int i = start; i < nums.length; i++)
            if (target == nums[i])
                return i;
        return -1;
    }
}