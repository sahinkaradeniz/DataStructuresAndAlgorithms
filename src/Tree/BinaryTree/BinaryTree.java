package Tree. BinaryTree;


import Queue.Queue;

public class BinaryTree<T extends Comparable<T>>  {
    public void InOrder(Node<T> root){ // InOrder Left-Data-Right
        if(root!=null){
            InOrder(root.left);
            System.out.println(root.value);
            InOrder(root.right);
        }
    }
    public void PreeOrder(Node<T> root){
        if(root!=null){
            System.out.println(root.value);
            PreeOrder(root.left);
            PreeOrder(root.right);
        }
    }
    public void PostOrder(Node<T> root){
        if(root!=null){
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.println(root.value);
        }
    }

    public static int MaxDepth(Node root){
        if(root==null) //agacta bir eleman yok ise
            return 0;
        int leftDepth=MaxDepth(root.left);
        int rightDepth=MaxDepth(root.right);
        return (leftDepth>rightDepth)?
                leftDepth+1 :
                rightDepth+1;
    }

}
