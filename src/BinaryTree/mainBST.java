package BinaryTree;

public class mainBST {
    public static void main(String[] args) {
        BTree tree=new BTree();

        tree.root=tree.insert(tree.root,10);
        tree.root=tree.insert(tree.root,15);
        tree.root=tree.insert(tree.root,8);
        tree.root=tree.insert(tree.root,24);
        tree.root=tree.insert(tree.root,18);
        tree.root=tree.insert(tree.root,5);
        tree.root=tree.insert(tree.root,11);
        tree.root=tree.insert(tree.root,9);

        System.out.println("root data : "+ tree.root.data);
        System.out.println("root left data : "+ tree.root.left.data);
        System.out.println("root right data : "+ tree.root.right.data);
        System.out.println("root left of left data : "+ tree.root.left.left.data);
        System.out.println("root right of left data : "+ tree.root.right.left.data);

    }


}
