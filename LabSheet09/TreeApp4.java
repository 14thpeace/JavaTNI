import java.util.Scanner;

public class TreeApp4 {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.createTree6();

        System.out.println("------------------------------");
        System.out.println("Binary Tree");
        System.out.println("------------------------------");

        tree.printTree(tree.getRoot(), 0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nInput N : ");
        int n = scanner.nextInt();

        Node current = tree.getRoot();

        while (current != null && current.data != n) {
            if (n < current.data) {
                current = current.left;
            }
            else {
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Cannot found Node(data=[" + n + "])");
        }

        else {

            if (current.left != null) {
                System.out.println("Left Child = " + current.left.data);
            }
            else {
                System.out.println("No Left Child");
            }

            if (current.right != null) {
                System.out.println("Right Child = " + current.right.data);
            }
            else {
                System.out.println("No Right Child");
            }

            if (current.left == null && current.right == null) {
                System.out.println(n + " is Leaf Node");
            }
            else {
                System.out.println(n + " is not Leaf Node");
            }
        }
        scanner.close();
    }
}
