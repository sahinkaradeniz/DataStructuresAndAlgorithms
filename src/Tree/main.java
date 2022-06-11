package Tree;

import Tree.BST.BST;
import Tree.BinaryTree.BinaryTree;

public class main {
    public static void main(String[] args) {
        BST<Integer> bst=new BST<Integer>();
        bst.Add(23);
        bst.Add(16);
        bst.Add(45);
        bst.Add(3);
        bst.Add(22);
        bst.Add(37);
         bst.Add(99);
        System.out.println(" InOrder");
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.InOrder(bst.Root);
        System.out.println(" PreOrder");
        binaryTree.PreeOrder(bst.Root);
        System.out.println("PostOrder");
        binaryTree.PostOrder(bst.Root);
        System.out.println("Reference node Root.left ");
        binaryTree.PreeOrder(bst.Root.left);
        System.out.print("min : ");
        bst.FindMin(bst.Root);
        System.out.print("max : ");
        bst.FindMax(bst.Root);
    }
}
