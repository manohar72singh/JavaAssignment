package LinkedList;

import java.util.Scanner;

class StackList
{
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];


    boolean isEmpty()
    {
        return (top < 0);
    }
    StackList()
    {
        top = -1;
    }
    public void push (int data)
    {
        if(top == maxsize-1)
        {
            System.out.println("Overflow !!");
            //return false;
        }
        else
        {
            //System.out.println("Enter Value");
            //int val = sc.nextInt();
            top++;
            arr[top]=data;
            System.out.println("Item pushed top"+top);
            //return true;
        }
    }
    boolean pop ()
    {
        if (top == -1)
        {
            System.out.println("Underflow !!");
            return false;
        }
        else
        {
            top --;
            System.out.println("Item popped");
            return true;
        }
    }
    void display ()
    {
        System.out.println("Printing stack elements .....");
        for(int i = top; i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
public class Stack {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        StackList s = new StackList();
        System.out.println("*********Stack operations using array*********\n");
        System.out.println("\n------------------------------------------------\n");
        s.push(15);
        s.push(20);
        s.push(25);
        s.display();
        s.pop();
        s.display();

    }
}
