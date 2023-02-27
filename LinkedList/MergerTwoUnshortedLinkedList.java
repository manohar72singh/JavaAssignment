package LinkedList;

class NewNode{
    int data;
    NewNode next;

    NewNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergerTwoUnshortedLinkedList {

    public static NewNode insertList(int data, NewNode head)
    {
        NewNode newNode = new NewNode(data);
        NewNode temp=head;
        if(temp == null){
            head=newNode;
            return head;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    public static void printNode(NewNode head){
        NewNode temp=head;
        if(temp==null){
            System.out.println("Empty node");
            return ;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }
    public static NewNode mergeTwoLinkedList(NewNode node1, NewNode node2)
    {
        NewNode head = new NewNode(0);
        NewNode p=head;
        NewNode p1 = node1;
        NewNode p2 = node2;
        while(p1!=null && p2!=null)
        {
            if(p1.data < p2.data){
                p.next=p1;
                p1=p1.next;
            }
            else{
                p.next=p2;
                p2=p2.next;
            }
            p=p.next;

        }
        if(p1!=null){
            p.next=p1;
        }
        if(p2!=null)
        {
            p.next=p2;
        }
        return head.next;
    }
    public static void main(String[] args) {
        NewNode head=null;

        head=insertList(4, head);
        head=insertList(6, head);
        head=insertList(3, head);
        head=insertList(8, head);
        head=insertList(10,head);
        System.out.println("1st List:--");
        printNode(head);

        NewNode head1=null;
        head1=insertList(2,head1);
        head1=insertList(1,head1);
        head1=insertList(7,head1);
        head1=insertList(9,head1);
        head1=insertList(5,head1);
        System.out.println("2nd List:--");
        printNode(head1);

        NewNode finalHead=null;
        finalHead=mergeTwoLinkedList(head,head1);
        System.out.println("Final List:--");
        printNode(finalHead);
    }
}
