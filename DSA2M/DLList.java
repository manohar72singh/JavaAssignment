package DSA2M;
class Node
{
    int data;
    Node pre;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
class DoubleLinkedList
{
    Node head;
    Node tail;

    public void printNode()
    {
        Node current = head;
        //current=head;


            if(head==null)
            {
                System.out.println("List is Empty");
                return;
            }
            else
            {
                System.out.println("List Are:=");
                while (current !=null)
                {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }

    }
    public void insertAtLast(int data)
    {
        if(head==null)
        {
            Node newNode = new Node(data);
            head=newNode;
            tail=newNode;
            //head=tail=newNode;
        }
        else
        {
            Node newNode = new Node(data);
            tail.next=newNode;
            newNode.pre=tail;
            tail=newNode;
        }
    }
    public void insertAtFirst(int data)
    {
        if (head == null)
        {
            Node newNode = new Node(data);
            head=tail=newNode;
        }
        else {
            Node newNode =new Node(data);
            newNode.next=head;
            head.pre=newNode;
            head=newNode;
            System.out.println("insert Element At 1st "+newNode.data);
        }
    }
    public int getTotalNode(Node head)
    {
        int count =0;
        Node current=head;
        while(current!=null)
        {
            count++;
            current= current.next;
        }
        return count;
    }
    public void insertAtSpecific(int data,int pos)
    {
        Node current = head;
        int i=1;
        int len= getTotalNode(current);
        if(pos>0 && pos< len)
        {
            System.out.print("invallid pos");
            return;
        }
        else
        {
            while (i!=pos)
            {
                current=current.next;
                i++;
            }
            Node newNode = new Node(1);
            current.pre.next=newNode;
            newNode.next=current;
            newNode.pre=current.pre;
            current.pre=newNode;
        }
    }
}
public class DLList {
    public static void main(String[] args) {
        //Node head=null;
        DoubleLinkedList dllist = new DoubleLinkedList();
        dllist.insertAtLast(20);
        dllist.insertAtLast(30);
        dllist.insertAtLast(40);
        dllist.insertAtLast(50);
        dllist.insertAtLast(60);
        dllist.insertAtFirst(2);
        dllist.insertAtSpecific(1,4);
        dllist.printNode();
    }
}
