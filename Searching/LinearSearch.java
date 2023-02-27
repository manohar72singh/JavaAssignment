package Searching;


import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[], int search) {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==search)
            {
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Start Hare:--");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the No you want to create an Array");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter no you want to search");
        int search = kb.nextInt();
        System.out.println("your Final Array is:-");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int result = linearSearch(arr,search);
        if(result== -1)
        {
            System.out.println("Element are Not Found in array");
        }
        else {
            System.out.println("Element are Found in index  "+result);
        }
    }
}
