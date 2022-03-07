public class MainClass {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pushFirst(2);
        stack.pushLast(5);
        stack.pushFirst(3);
        stack.pushLast(6);

        stack.showList();

/*
        stack.push(5);
        stack.push(10);

        stack.showList();
        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Stack length: " + stack.length());

        stack.pop();
        stack.showList();
        System.out.println("Top of stack: " + stack.peek());
        System.out.println("Stack length: " + stack.length());
*/
    }
}
