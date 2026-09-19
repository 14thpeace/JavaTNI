public class BSTApp1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinarySearchTree tree = new BinarySearchTree();

        tree.sampleTree1();
        tree.printTree(tree.getRoot(), 0);

        System.out.println();
        System.out.println("Minimum Node is " + tree.findMinimum(tree.getRoot()));
        System.out.println("Maximum Node is " + tree.findMaximum(tree.getRoot()));

        int target = 40;
        System.out.println("IS " + target + " in BST => " + tree.findSpecificData(target) );


        int delNode = 60;
        tree.searchDeleteNode(delNode);
        System.out.println("Parent is " + tree.getParent().data);
        System.out.println("Delete node is " + tree.getDeleteNode().data);

        System.out.println();
        tree.delete(delNode);
        tree.printTree(tree.getRoot(), 0);
    }

}
