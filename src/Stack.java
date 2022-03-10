public class Stack {
    private Node head, tail;

    public Stack()
    {
        head = null;
        tail = null;
    }

    public void pushFirst(int addData)
    {
        Node newNode = new Node(addData);
        if(head == null)
        {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else
        {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }
    }

    public void pushLast(int addData)
    {
        Node newNode = new Node(addData);
        if(head == null)
        {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void popFirst()
    {
        if(head != null)
        {
            if(head.next == null)
            {
                head = null;
                tail = null;
            }
            else
            {
                head = head.next;
                head.previous = null;
            }
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }

    public void popLast()
    {
        if(tail != null)
        {
            if(tail.previous == null)
            {
                tail = null;
                head = null;
            }
            else
            {
                tail = tail.previous;
                tail.next = null;
            }
        }
        else
        {
            System.out.println("Delete from an empty list?");
            System.exit(0);
        }
    }

    public String peekFirst()
    {
        if(head != null)
        {
            return head.getData() + "";
        }
        else
        {
            System.out.println("List is empty");
            return null;
        }
    }

    public String peekLast()
    {
        if(tail != null)
        {
            return tail.getData() + "";
        }
        else
        {
            System.out.println("List is empty");
            return null;
        }
    }

    public int length()
    {
        int count = 0;
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.next;
        }
        return count;
    }

    public void showList()
    {
        Node position = head;
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        while(position != null)
        {
            System.out.print(position.getData() + " ");
            position = position.next;
        }
        System.out.println();
    }

    private class Node
    {
        private int data;
        Node previous;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }

        public int getData()
        {
            return data;
        }
    }
}
