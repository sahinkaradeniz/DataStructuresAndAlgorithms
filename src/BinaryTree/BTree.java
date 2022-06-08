package BinaryTree;

public class BTree {
    Node root;
    public BTree(){
        root=null;
    }

    Node newNode(int data){
        root=new Node(data);
      //  System.out.println(data+" insert tree");
        return root;
    }

    Node insert(Node root,int data){
        if(root!=null){
            if(data< root.data) {
                root.left = insert(root.left, data);
                System.out.println(data +" insert root left");
            }
            else{
                root.right=insert(root.right,data);
                System.out.println(data +" insert root right");
            }
        }else{
            root=newNode(data);
        }
        return root;
    }


}
