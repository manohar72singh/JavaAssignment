package sort;

import java.util.Scanner;

public class SelectionSort {
    public static void printArray(int arr[])
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for (int j=i+1;j< arr.length;j++)
            {
                if(arr[j] < arr[min])
                    min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }

    }
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter No:-");
        int N= kb.nextInt();
        int arr[]=new int[N];
        for (int i=0;i<N;i++)
        {
            arr[i]=kb.nextInt();
        }

//        System.out.println("Array(Before sort)=");
//        for (int i=0;i< N;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//
//        for (int i=0;i<N-1;i++)
//        {
//            int min=i;
//            for (int j=i+1;j<N;j++)
//            {
//                if(arr[j] < arr[min])
//                    min=j;
//            }
//            int temp=arr[i];
//            arr[i]=arr[min];
//            arr[min]=temp;
//        }
//        System.out.println("\n Array(After sort)=");
//        for (int i=0;i< N;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

        System.out.println("Array(Before Sort)");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Array(After Sort)");
        printArray(arr);
        int pos=0;
        for (int i=0;i<N;i++)
        {

        }
    }
}