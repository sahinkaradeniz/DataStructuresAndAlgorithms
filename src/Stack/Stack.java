package Stack;

public class Stack {
    int topOfStack;
    int capacity;
    int[] stack;
    Stack(int capacity){
        this.capacity=capacity;
        stack=new int[capacity];
        topOfStack=-1; // ilk push anında 0 sayısını elde edebilmek için

    }
    void push(int value){
     if(topOfStack==capacity-1){
         System.out.println("StackOverflow");
     }else{
        // topOfStack++;
         stack[++topOfStack]=value;
         System.out.println("push :"+value);
     }
    }
    void peek(){
        if(topOfStack<0){
            System.out.println("Underflow");
        }else{
            int item=stack[topOfStack];
            System.out.println(item);
        }
    }
    int pop(){
        if(topOfStack<0){
            System.out.println("Underflow");
            return 0;
        }else{
            /*
            int item=stack[topOfStack];
            topOfStack--;
            System.out.println("pop :");
            return item; */
        
            return stack[topOfStack--];

        }
    }
}
