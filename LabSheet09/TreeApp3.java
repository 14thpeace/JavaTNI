public class TreeApp3 {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        tree.createTree5();

        System.out.println("------------------------------");
        System.out.println("Original Tree");
        System.out.println("------------------------------");

        tree.printTree(tree.getRoot(), 0);


        System.out.println("\n------------------------------");
        System.out.println("Delete Leaf Node : 45");
        System.out.println("------------------------------");

        tree.delete(45);
        tree.printTree(tree.getRoot(), 0);


        System.out.println("\n------------------------------");
        System.out.println("Delete Node with 1 Child : 20");
        System.out.println("------------------------------");

        tree.delete(20);
        tree.printTree(tree.getRoot(), 0);


        System.out.println("\n------------------------------");
        System.out.println("Delete Node with 2 Children : 30");
        System.out.println("------------------------------");

        tree.delete(30);
        tree.printTree(tree.getRoot(), 0);
    }
}