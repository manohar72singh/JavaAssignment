package LinkedList;

import com.sun.source.tree.WhileLoopTree;

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
public class LList {
    public static void printList(Node head)
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.print("List is empty");
        }
        else
        {
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }


    }
    public static Node insertAtLast(int data,Node head)
    {
        if(head==null)
        {
            Node nnode= new Node(data);
            head=nnode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node nnode=new Node(data);
        temp.next=nnode;
        return head;
    }
    public static Node insertAtFirst(int data,Node head)
    {
        if(head==null)
        {
            Node node=new Node(data);
            head=node;
            return head;
        }
        Node temp=head;
        Node nnode=new Node(data);
        nnode.next=temp;
        head=nnode;
        return head;
    }
    public static int len(Node head)
    {
        Node temp=head;
        int count=0;
        while (temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static Node insertAtSpecPosition(int data,int pos,Node head)
    {
        if(head==null)
        {
            Node nnode=new Node(data);
            head=nnode;
            return head;
        }
        if(pos<0 || pos>len(head))
        {
            System.out.println("invallid pos");
            return head;
        }
        else if(pos==1)
        {
            head=insertAtFirst(data,head);
            return head;
        } else if (pos==len(head))
        {
            head=insertAtLast(data,head);
            return head;
        }
        {
            int i = 1;
            Node temp = head;
            Node pre = null;
            while (i != pos) {
                i++;
                pre = temp;
                temp = temp.next;
            }
            Node nnode = new Node(data);
            pre.next = nnode;
            nnode.next = temp;
            return head;
        }
    }
    public static Node reverseNode(Node head)
    {
        if (head==null )
            return head;
        if(head.next==null)
        {
            return head;
        }
        Node pre = null;
        Node next = null;
        Node current=head;
        while (current!=null)
        {
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        head=pre;
        return head;
    }

    public static  Node deleteMidNode(Node head)
    {
        if(head==null)
            return null;
        if(head.next==null)
        {
            return null;
        }
        Node temp=head;
        int count=len(temp);
        int mid=count/2;
        while (mid-- > 1)
        {
            head = head.next;
        }
        head.next=head.next.next;
        return temp;
    }

    public static void main(String[] args) {

        Node head=null;
        head=insertAtLast(10,head);
        head=insertAtFirst(20,head);
        printList(head);

    }
}

 