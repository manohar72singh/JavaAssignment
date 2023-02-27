package StackLinkedListRep;
class  Node
{
    int data;
    Node next;
}
class Stack
{
    Node top;
    int totalStackElement;

    Stack()
    {
        top=null;
        totalStackElement=0;
    }

    public boolean isEmpty()
    {
        return top==null;
    }
    public int size()
    {
        return totalStackElement;
    }
    public void push(int x)
    {
        Node node=new Node();
        if(node==null)
        {
            System.out.println("Stack is OverFlow");
            return;
        }
        node.data=x;
        node.next=top;
        top=node;
        totalStackElement+=1;
        System.out.println("Inserted Element "+ x);
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack OverFlow");
            System.exit(-1);
        }
        return top.data;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack OverFlow");
            System.exit(-1);
        }
        int top= peek();
        totalStackElement-=1;
        this.top=(this.top).next;
        System.out.println("Removing "+ top);
        return top;
    }

}
public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(20);
        stack.push(30);
        stack.push(5);
        System.out.println("Total Stack Element "+stack.size());
        stack.pop();
        stack.pop();
        System.out.println("Total Stack Element "+stack.size());
        System.out.println("top Stack Element "+stack.peek());
    }
}
