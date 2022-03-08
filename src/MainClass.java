public class MainClass {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.pushFirst(2);
        stack.pushLast(5);
        stack.pushFirst(3);
        stack.pushLast(6);

        stack.peekFirst();
        stack.peekLast();

        stack.showList();
        System.out.println(stack.length());

        stack.popFirst();
        stack.popLast();

        stack.showList();
        System.out.println(stack.length());
    }
}
