package DSA1M;

import java.util.Scanner;

public class MergeTwoUnsortArrayFindArray {

    public static void sort(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]>=arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void findMediam(int arr[],int arr1[],int s,int s1)
    {
        int ns=s+s1;
        int mergerArray[] = new int[ns];
        int i=0,j=0,k=0;
        while (k<ns)
        {
            if(i<s)
            {
                mergerArray[k]= arr[i];
                i++;
                k++;
            }
            if(j<s1)
            {
                mergerArray[k]=arr1[j];
                j++;
                k++;
            }
        }
        for(i=0;i<ns;i++)
        {
            System.out.print("["+mergerArray[i]+"]");
        }
        sort(mergerArray);
        if(ns%2==1)
        {
            double m =mergerArray[ns/2];
            System.out.print("Medium"+m);
        }
        else
        {
            double m=(mergerArray[ns/2]+(mergerArray[(ns/2)-1]))/2.0;
            System.out.print("Medium"+m);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No for 1st Array");
        int n=scanner.nextInt();
        System.out.println("Enter No for 2nd Array");
        int m=scanner.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[m];
        System.out.println("Enter No in 1st Array");
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter No in 2nd Array");
        for(int i=0;i<m;i++)
        {
            arr2[i]=scanner.nextInt();
        }
        findMediam(arr,arr2,n,m);
    }
}
