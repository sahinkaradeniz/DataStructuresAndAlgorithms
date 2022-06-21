package Tree;

import Tree.BST.BST;
import Tree.BinaryTree.BinaryTree;
import Tree.BinaryTree.Node;

public class main {
    public static void main(String[] args) throws Exception {
        BST<Integer> bst= new BST<>();

        bst.Add(23);
        bst.Add(16);
        bst.Add(45);
        bst.Add(3);
        bst.Add(22);
        bst.Add(37);
        bst.Add(99);

        BinaryTree<Integer> binaryTree=new BinaryTree<>();

        System.out.println("--------------------------InOrder--------------------------");
        binaryTree.InOrder(bst.Root);


        System.out.println("--------------------------PreOrder--------------------------");
        binaryTree.PreeOrder(bst.Root);


        System.out.println("--------------------------PostOrder--------------------------");
        binaryTree.PostOrder(bst.Root);

        System.out.println("------------------Reference node Root.left ------------------");
        binaryTree.PreeOrder(bst.Root.left);

        System.out.print("min value : ");
        bst.FindMin(bst.Root);

        System.out.print("max value : ");
        bst.FindMax(bst.Root);

        Node<Integer> item=bst.Find(bst.Root,23);
        System.out.println("Search : "+item.value+ " right : "+item.right.value+" left : "+item.left.value);

        bst.Remove(bst.Root,3);
        System.out.println("---------------------------items ---------------------------");
        binaryTree.InOrder(bst.Root);
        System.out.println("--------------------------- ---------------------------");
        System.out.println("--------------------------- Max Depth : "+binaryTree.MaxDepth(bst.Root)+" ---------------------------");


    }
}
