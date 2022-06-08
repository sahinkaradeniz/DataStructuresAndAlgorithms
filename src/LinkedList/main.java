package LinkedList;

public class main {
    public static void main(String args[]) {
        OurLinkedList linkedList=new OurLinkedList();
        linkedList.add("Sahin");
        linkedList.add("Karadeniz");
        linkedList.add("GitHub");
        linkedList.display();
        System.out.println("------------Deleted------------");
        linkedList.delete();
        linkedList.display();
        System.out.println("------------Deleted------------");
        linkedList.delete();
        linkedList.display();
    }
}
