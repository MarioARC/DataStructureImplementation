import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void StackFirst()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        assertTrue(stack.peekFirst().equals("10"));
    }

    @Test
    public void StackFirst2()
    {
        Stack stack = new Stack();
        stack.pushFirst(5);
        assertTrue(stack.peekFirst().equals("5"));
    }

    @Test
    public void StackFirst3()
    {
        Stack stack = new Stack();
        stack.pushLast(25);
        assertTrue(stack.peekFirst().equals("25"));
    }

    @Test
    public void StackFirst4()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        stack.pushFirst(30);
        stack.pushLast(40);
        assertTrue(stack.peekFirst().equals("30"));
    }

    @Test
    public void StackFirst5()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        stack.popFirst();
        assertTrue(stack.peekFirst().equals("20"));
    }

    @Test
    public void StackLast()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        assertTrue(stack.peekLast().equals("20"));
    }

    @Test
    public void StackLast2()
    {
        Stack stack = new Stack();
        stack.pushLast(35);
        assertTrue(stack.peekLast().equals("35"));
    }

    @Test
    public void StackLast3()
    {
        Stack stack = new Stack();
        stack.pushFirst(55);
        assertTrue(stack.peekLast().equals("55"));
    }

    @Test
    public void StackLast4()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        stack.pushFirst(30);
        stack.pushLast(40);
        assertTrue(stack.peekLast().equals("40"));
    }

    @Test
    public void StackLast5()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(20);
        stack.popLast();
        assertTrue(stack.peekFirst().equals("10"));
    }

    @Test
    public void StackLengthTest()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushFirst(20);
        stack.pushFirst(30);
        assertTrue(stack.length() == 3);
    }

    @Test
    public void StackLengthTest2()
    {
        Stack stack = new Stack();
        stack.pushFirst(10);
        stack.pushLast(40);
        stack.pushFirst(20);
        stack.pushLast(30);
        assertTrue(stack.length() == 4);
    }

    @Test
    public void StackLengthTest3()
    {
        Stack stack = new Stack();
        stack.pushLast(10);
        stack.pushLast(20);
        stack.pushLast(30);
        stack.pushLast(40);
        stack.pushLast(50);
        assertTrue(stack.length() == 5);
    }

    @Test
    public void StackLengthTest4()
    {
        Stack stack = new Stack();
        stack.pushLast(10);
        stack.pushLast(20);
        stack.pushLast(30);
        stack.pushLast(40);
        stack.pushLast(50);
        stack.popLast();
        stack.popLast();
        assertTrue(stack.length() == 3);
    }

    @Test
    public void StackLengthTest5()
    {
        Stack stack = new Stack();
        stack.pushFirst(1);
        stack.popFirst();
        assertTrue(stack.length() == 0);
    }

    @Test
    public void StackLengthTest6()
    {
        Stack stack = new Stack();
        stack.pushLast(2);
        stack.popLast();
        assertTrue(stack.length() == 0);
    }
}