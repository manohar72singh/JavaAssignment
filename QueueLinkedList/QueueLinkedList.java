package QueueLinkedList;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Queue
{
    Node rear = null;
    Node front= null;
    int count=0;

    public boolean isEmpty()
    {
        return rear==null && front==null;
    }
    public int size()
    {
        return count;
    }
    public int deQueue()
    {
        if(front==null)
        {
            System.out.println("underflow");
            System.exit(-1);
        }
        Node temp=front;
        front=front.next;
        if(front==null)
        {
            rear=null;
        }
        count-=1;
        System.out.println("Removing item "+temp.data);
        return temp.data;
    }
    public void enQueue(int item)
    {
        Node node= new Node(item);
        if(front==null)
        {
            front=node;
        }
        else
        {
            rear.next=node;
        }
        rear=node;
        count+=1;
        System.out.println("Inserted "+item);
    }
    public int peek()
    {
        if(front==null)
        {
            System.out.println("underflow");
            System.exit(-1);
        }
        return front.data;
    }
}
public class QueueLinkedList {
    public static void main(String[] args) {
        Queue queue=new Queue();
        //queue.deQueue();
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
        System.out.println("Total que element "+queue.size());
        queue.deQueue();
        System.out.println("Total que element "+queue.size());
        System.out.println("fornt element "+queue.peek());
    }
}
