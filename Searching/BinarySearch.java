package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void printArray(int arr[])
    {
        System.out.println("final array ===");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void sort(int arr[])
    {
        int length = arr.length;
        int k=0;
        int tempArray[] = new int[length];
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1; j< arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static int binarySearch(int arr[],int search)
    {
        int left =0;
        int right = arr.length-1;
        while (left <= right)
        {
            int mid = left+ (right - left)/2;
            if(arr[mid]==search)
            {
                return mid+1;
            }
            else if(arr[mid]< search)
            {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter no you want to create arrays");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = kb.nextInt();
        }
        System.out.println("Enter number to search");
        int search = kb.nextInt();
        printArray(arr);
        System.out.println("Before sort===");
        sort(arr);
        printArray(arr);
        int result = binarySearch(arr, search);
        if(result== -1)
        {
            System.out.println("Element are Not Found in array");
        }
        else {
            System.out.println("Element are Found in index  "+result);
        }
    }
}
