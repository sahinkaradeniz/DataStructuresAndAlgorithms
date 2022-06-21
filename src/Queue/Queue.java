package Queue;

public class Queue {
    int[] arr;
    int capacity,front,rear,currentSize;

    public Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=0;
        rear=-1; // bir sey eklandiğinde artarak index dondurulecek
        currentSize=0;
    }
    boolean isEmpty(){
       return currentSize==0;

    }
    boolean isFull(){
        return currentSize==capacity;
    }

    void enqueue(int value){
        if(isFull()){
            System.out.println("Overflow");
        }else{
            rear+=1;
            arr[rear]=value;
            currentSize++;
            System.out.println(rear+" "+ value);
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
        }else {
            System.out.println("Remove : "+arr[front]);
            front+=1;
            currentSize--;
        }
    }



}
