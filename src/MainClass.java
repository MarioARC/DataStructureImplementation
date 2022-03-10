public class MainClass {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pushFirst(2);
        stack.pushLast(5);
        stack.pushFirst(3);
        stack.pushLast(6);

        System.out.println("Head of stack: " + stack.peekFirst());
        System.out.println("Tail of stack: " + stack.peekLast());
        System.out.println("Stack length: " + stack.length());
        stack.showList();

        stack.popFirst();
        stack.showList();

        stack.popLast();
        stack.showList();

        stack.popFirst();
        stack.showList();

        stack.popLast();
        stack.showList();
    }
}
