package Queue;

public class mainQueue {
    public static void main(String[] args) {
        Queue queue =new Queue(5);
        queue.enqueue(25);
        queue.enqueue(56);
        queue.enqueue(53);
        queue.enqueue(12);
        queue.enqueue(92);
        queue.enqueue(11);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


    }
}
