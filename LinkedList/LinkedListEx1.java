package LinkedList;

import java.util.Scanner;

class Node1
{
    int data;
    Node next;
    Node1(int data)
    {
        data=this.data;
        this.next=null;
    }
}
public class LinkedListEx1 {
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
    public static Node revOrder(Node head)
    {
        Node pre=null;
        Node next=null;
        Node current=head;

        while(current!=null)
        {
         next=current.next;
         current.next=pre;
         pre=current;
         current=next;

        }
        head=pre;
        return head;
    }
    public static Node insertAtLast(int data,Node head)
    {

        if(head==null)
        {
            Node nnode=new Node(data);
            head=nnode;
            return head;
        }
        Node temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;

        }
        Node nnode=new Node(data);
        temp.next=nnode;
        return head;
    }
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter total input No:=");
        int n=kb.nextInt();
        Node head=null;
        for(int i=0;i<n;i++)
        {
            int data=kb.nextInt();
            head=insertAtLast(data,head);
        }
        printList(head);
        System.out.println("");
        head=revOrder(head);
        printList(head);
    }
}
