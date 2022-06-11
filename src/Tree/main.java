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
        BinaryTree binaryTree=new BinaryTree();
        binaryTree.InOrder(bst.Root);

    }
}
