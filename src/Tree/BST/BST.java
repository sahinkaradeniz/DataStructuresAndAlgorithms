package Tree.BST;

import Tree.BinaryTree.Node;

// forEach yapisini desteklemesi icin Iterable Sinifini implement ettik
public class BST<T extends Comparable<T>>   {
    public Node Root;

    public BST(Node root) {
        Root = root;
    }

    public BST() {

    }

    public void Add(T value) {
        if (value == null) {
            throw new NullPointerException();
        }
        Node newNode=new Node(value);

        if(Root==null){
            Root=newNode;
        }else{
            Node current = Root;
            Node parent;
            while (true){ // var olan dügüm kosulu saglamadıkca bir alt dügüm root'a atanarak bir alt kata iniyor break kodu calısana kadar
                parent=current;
                // Sol alt agac
                if (value.compareTo((T) current.value)<0){ // gelen deger eğer root'un değerinden kucuk ise
                    current=current.left; //current=root degeriydi, curent'in solunu isaret etmesi icin current degerini  soluna esitliyoruz.
                        if(current==null){ //eger solu bos ise orada bir dügüm yoktur. Yeni dügümü oraya koyabiliriz.
                            parent.left=newNode; // parent=root root'un soluna esitle
                            System.out.println(parent.value.toString()+" add left "+value);
                            break;
                        }
                }else{ //sag alt agac
                    current=current.right;
                    if (current==null){
                        parent.right=newNode;
                        System.out.println(parent.value.toString()+" add right "+value);
                        break;
                    }
                }
            }
        }
    }
    public Node<T> FindMin(Node root){
        Node current=root;
        while (current.left!=null){
            current=current.left;
        }
        System.out.println(current.value);
        return current;
    }

    public Node<T> FindMax(Node root){
        Node current=root;
        while (current.right!=null){
            current=current.right;
        }
        System.out.println(current.value);
        return current;
    }

    public Node<T> Find(Node<T> root,T key){ // Node arama islemi yaparken istedigimiz node uzerinden yapmamız icin
            Node current=root;
            while (key.compareTo((T) current.value)!=0){ // key!=current.value oldugu surece devam et
                        if(key.compareTo((T) current.value)<0){
                            current=current.left;
                        }else {
                            current=current.right;
                        }
                        if (current==null){
                            System.out.println("Could not found");
                        }
            }
            return current;
    }



    public Node<T> Remove(Node<T> root,T key){
        if(root==null){
            return root;
        }
        if (key.compareTo(root.value)<0){
            root.left=Remove(root.left,key);
        } else if (key.compareTo(root.value)>0) {
            root.right=Remove(root.right,key);

        }else {
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            root.value=FindMin(root.right).value;
            root.right=Remove(root.right,root.value);
        }
        return root;
    }

}