import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void TopOfStack() {
        Stack stack = new Stack();
        stack.pushFirst(10);
        assertTrue(stack.peekFirst().equals("10"));
    }
}