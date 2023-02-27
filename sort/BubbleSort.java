package sort;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[])
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("final Array=");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter No:-");
        int N=kb.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=kb.nextInt();
        }
        bubbleSort(arr);

        //        System.out.print("Element are(Before Sort):");
//        for(int i=0;i<N;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        // SHORT THE ELEMENT
//        for(int i=0;i<N-1;i++)
//        {
//            for (int j=i+1;j<N;j++)
//            {
//                if (arr[i]>arr[j])
//                {
//                    int t=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=t;
//                }
//            }
//        }
//
//        System.out.println("Element are(After Sort):");
//        for(int i=0;i<N;i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

    }
}
