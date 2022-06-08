package Stack;

public class main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("----------peek()----------");
        stack.peek();
        System.out.println("---------pop()---------");
        stack.pop();
        System.out.println("----------peek()----------");
        stack.peek();
        stack.push(55);
        System.out.println("---------peek()---------");
        stack.peek();
    }
}
