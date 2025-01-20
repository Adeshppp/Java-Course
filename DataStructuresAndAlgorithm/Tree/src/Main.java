
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.insertNode(8);
        binaryTree.insertNode(7);
        binaryTree.insertNode(12);
        binaryTree.insertNode(15);
        binaryTree.insertNode(2);
        binaryTree.insertNode(5);
        binaryTree.insertNode(6);
        binaryTree.inOrderTraversal();
        binaryTree.preOrderTraversal();
        binaryTree.postOrderTraversal();
    }
}
