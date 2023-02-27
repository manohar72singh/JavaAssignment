package DSA1M;

import java.util.Scanner;

public class RotateArrayKthtimes {
    public static void rotateArray(int arr[],int k)
    {
        int n= arr.length;
        k=k%n;
        System.out.println(" ");
        System.out.println(n+" "+k+" "+k%n);
        reverseArray(arr,0, n-k-1);
        reverseArray(arr,n-k,n-1);
        reverseArray(arr,0,n-1);
    }
    public static void reverseArray(int arr[],int start,int end)
    {
        while (start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter to talal No element:=");
        int n=kb.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter no to rotate araay:=");
        int k=kb.nextInt();
        System.out.println("After Rotate:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        rotateArray(arr,k);
        System.out.println(" ");
        System.out.println("Before Rotate:-");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
