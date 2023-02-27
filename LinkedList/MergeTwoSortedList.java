package LinkedList;

import java.util.Scanner;

public class MergeTwoSortedList {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int i = 0; i < n; i++) {
//            nums1[i + m] = nums2[i];
//        }
//        Arrays.sort(nums1);
//    }
    public static int[] mergeArrays(int[] arr1, int[] arr2, int n, int m)
    {
        int i = 0, j = 0, k = 0;
        int arr3[]=new int[m+n];
        // Traverse both array
        while (i < n && j < m) {
        if (arr1[i] < arr2[j]) {
            arr3[k] = arr1[i];
            i = i + 1;
        }
        else{
            arr3[k] = arr2[j];
            j = j + 1;
        }
        k = k + 1;
    }
        while (i < n){
            arr3[k] = arr1[i];
            i = i + 1;
            k = k + 1;
        }
        while (j < m){
            arr3[k] = arr2[j];
            j = j + 1;
            k = k + 1;
        }
        // copy arr3 to arr1
        i = 0;
        while(i < (m + n)){
            arr1[i] = arr3[i];
            i = i + 1;
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter No first Array");
        int n1=kb.nextInt();
        int arr1 []=new int[n1];
        for(int i=0;i<n1;i++)
            arr1[i]=kb.nextInt();
        System.out.println("Enter No 2nd array ");
        int n2=kb.nextInt();
        int arr2 []=new int[n2];
        for(int i=0;i<n2;i++)
            arr2[i]=kb.nextInt();
        int n3=n1+n2;

        int arr3 []= new int[n3];
        arr3=mergeArrays(arr1,arr2,n1,n2);
        for(int i=0;i<n3;i++)
            System.out.print(arr3[i]);
    }
}
