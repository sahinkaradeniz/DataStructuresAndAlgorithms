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
    public void FindMin(Node root){
        Node current=root;
        while (current.left!=null){
            current=current.left;
        }
        System.out.println(current.value);
    }

    public void FindMax(Node root){
        Node current=root;
        while (current.right!=null){
            current=current.right;
        }
        System.out.println(current.value);
    }
}