package LinkedList;

public class OurLinkedList {
    Node headNode;
    public OurLinkedList(){
        headNode=null;
    }
    public void add(Object value){
        Node newNode=new Node(value,null);
        if(headNode==null){
            headNode=newNode;
        }else {
            newNode.next=headNode;
            headNode=newNode;
        }

    }
    public void delete(){
        headNode=headNode.next; // head nodu bir sonraki node eşitleyerek head node'u siliyoruz
    }
    public void display(){
        Node n=headNode;
        while (n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }
    public void aktar(){
        Node n=headNode;
    }
}
