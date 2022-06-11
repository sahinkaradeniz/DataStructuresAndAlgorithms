package Tree.BinaryTree;

public class BinaryTree<T extends Comparable<T>>  {
    public void InOrder(Node<T> root){ // InOrder Left-Data-Right
        if(root!=null){
            InOrder(root.left);
            System.out.println(root.value);
            InOrder(root.right);
        }
    }
}
