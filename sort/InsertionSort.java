package sort;

import java.util.Scanner;

public class InsertionSort {

    public static void printArray(int arr[])
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[])
    {
        for (int i=1;i<arr.length;i++)
        {
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && temp<arr[j])
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
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
        System.out.println("array(Before Sort)");
        printArray(arr);
//        for (int i=1;i<N;i++)
//        {
//            int temp=arr[i];
//            int j=i-1;
//            while (j>=0 && temp<arr[j])
//            {
//                arr[j+1]=arr[j];
//                j=j-1;
//            }
//            arr[j+1]=temp;
//        }
        insertionSort(arr);
        System.out.println("array(After Sort)");
        printArray(arr);
    }
}
