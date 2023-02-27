package QueueLinkedList;

import java.util.Stack;

class QueueStack<T>
{
    Stack<T> s1,s2;
    QueueStack()
    {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
//    public boolean isEmpty()
//    {
//        return
//    }
    public void enQueue(T item)
    {
        while (!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(item);
        while (!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public T dequeue()
    {
        if (s1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }
        return s1.pop();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        int[] keys = { 15, 2, 3, 4, 5 };
        QueueStack<Integer> queueStack =new QueueStack<Integer>();
        // insert above keys
        for (int key: keys) {
            queueStack.enQueue(key);
        }

        System.out.println(queueStack.dequeue());	// print 1
        System.out.println(queueStack.dequeue());
    }
}
