package sort;

import java.util.Scanner;

public class MergeSort {
    public static void printArray(int arr[])
    {
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
//        int temp[]=new int[end-start+1];
//        int i=start,j=mid+1,k=0;
//        while(i<=mid && j<=end)
//        {
//            if (arr[i]<arr[j])
//            {
//                temp[k]=arr[i];
//                i+=1;
//            }
//            else
//            {
//                temp[k]=arr[j];
//                j+=1;
//            }
//            k+=1;
//        }
//
//        while (i<=mid)
//        {
//            temp[k]=arr[i];
//            i+=1;
//            k+=1;
//        }
//        while (j<=end)
//        {
//            temp[k]=arr[j];
//            j+=1;
//            k+=1;
//        }
//        for(i=start;i<end;i++)
//            arr[i]=temp[i-start];

        int n1=mid-start+1;
        int n2=end-mid;
        int l[]=new int[n1];
        int r[]=new int[n2];
        for(int i=0;i<n1;i++)
        {
            l[i]=arr[start+i];
        }
        for(int i=0;i<n2;i++)
        {
            r[i]=arr[mid+1+i];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<n1 && j<n2)
        {
            if(l[i]<=r[j])
            {
                arr[k]=l[i];
                i++;
            }
            else
            {
                arr[k]=r[j];
                j++;
            }
            k++;
        }
        while (i<n1)
        {
            arr[k]=l[i];
            i++;
            k++;
        }
        while (j<n2)
        {
            arr[k]=r[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[],int start,int end)
    {
        if (start<end)
        {
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter No");
        int n=kb.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Start");
        System.out.println("\nBefore sorting array elements are - ");
        printArray(arr);
        mergeSort(arr,0,arr.length-1);
        System.out.println("\nAfter sorting array elements are - ");
        printArray(arr);
    }

}
/*
port java.util.*;
public class BinarySearchManual {

	public static void main(String[] args) {
		int[] arr= {6,9,8,3,5,2};
		System.out.println(Arrays.toString(arr));
		int [] res = mergeSortBig(arr);
		System.out.println(Arrays.toString(res));

	}
	// 6 9 8 3 5 2
	// 6 9 8    3 5 2
	// 6 9   8   3 5  2
	// 6  9  8  3 5 2
	// 6 9  8  3 5   2
	// 6 8 9   2 3 5
	// 2 3 5 6 8 9


	//6 9   8     res = [6,8,9]    [6 9 8 3 5 2]

	public static int[] mergeSort(int[]arr) {
		mergeSortHelper(arr, 0, arr.length-1);
	//	System.out.println(arr);
		return arr;
	}
	private static void mergeSortHelper(int[]arr,int lo, int hi) {
		if(lo>=hi)return ;

		int mid = (lo+hi)/2;
		mergeSortHelper(arr,lo,mid);
		mergeSortHelper(arr,mid+1,hi);
		merge(arr,lo,mid,hi);
		return;
	}

	private static void merge(int[] arr, int lo,int mid, int hi) {
		int l = hi-lo+1;
		int[] res = new int [l];
		int j = lo;
		int k = mid+1;
		for(int i = 0;i<l;i++) {
			if(k<=hi && arr[j]>=arr[k]) {
				res[i] = arr[k];
				k++;
			}else {
				if(j<=mid) {
					res[i] = arr[j];
					j++;
				}
			}
		}

		for(int i = lo, m =0;i<=hi;i++) {
			arr[i] = res[m++];
		}
	}
	public static int[] mergeSortBig(int[]arr){
		if(arr.length==1) {
			return arr;
		}
		int mid = (0+arr.length-1)/2;
		int[] left = mergeSortBig(Arrays.copyOfRange(arr, 0, mid+1));
		int[] right = mergeSortBig(Arrays.copyOfRange(arr, mid+1, arr.length));

		int[] res = merge(left,right);
		return res;
	}
	private static int[] merge(int[] left, int[] right) {
		int [] res  = new int[left.length+right.length];
		int  i = 0;
		int j = 0;
		int k = 0;
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				res[k++] = left[i++];
			}else{
				res[k++] = right[j++];
			}
		}
		while(i<left.length) {
			res[k++] = left[i++];
		}
		while(j<right.length) {
			res[k++] = right[j++];
		}
		//System.out.println(Arrays.toString(res));
		return res;
	}
}


* */