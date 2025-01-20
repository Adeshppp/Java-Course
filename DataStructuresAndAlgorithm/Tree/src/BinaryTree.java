public class BinaryTree {

    public Node root;

    public void insertNode(int data) {
         root = insertNodeRec(root, data);
    }

    public Node insertNodeRec(Node root, int data) {
        if(root == null) root = new Node(data);
        else if(data<root.data) root.left = insertNodeRec(root.left, data);
        else if(data>root.data) root.right = insertNodeRec(root.right, data);
        return root;
    }

    public void inOrderTraversal(){
        System.out.print("Inorder Traversal :  ");
        inOrderTraversalRec(root);
        System.out.println();
    }

    public void inOrderTraversalRec(Node root){
        if(root!=null){
            inOrderTraversalRec(root.left);
            System.out.print(root.data+" ");
            inOrderTraversalRec(root.right);
        }
    }
    public void preOrderTraversal(){
        System.out.print("Pre-order Traversal : ");
        preOrderTraversalRec(root);
        System.out.println();
    }

    public void preOrderTraversalRec(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }
    public void postOrderTraversal(){
        System.out.print("Post-order Traversal : ");
        postOrderTraversalRec(root);
        System.out.println();
    }

    public void postOrderTraversalRec(Node root){
        if(root!=null){
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.print(root.data+" ");
        }
    }


}
