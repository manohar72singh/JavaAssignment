package DSA1M;

public class MergeSort {
    public static void merge(int arr[],int start,int mid,int end)
    {
        int l1=mid-start+1;
        int r1=end-mid;
        int l[]= new int[l1];
        int r[]=new int[r1];
        int k=0;
        for(int i=start;i<=mid;i++)
        {
            l[k]=arr[i];
            k++;
        }
        k=0;
        for(int i=mid+1;i<=end;i++)
        {

            r[k]=arr[i];
            k++;
        }
        k=start;
        int i=0;
        int j=0;
        while (i<l1 && j<r1)
        {
            if (l[i]<=r[j])
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
        while (i<l1)
        {
            arr[k]=l[i];
            k++;
            i++;
        }
        while (j<r1)
        {
            arr[k]=r[j];
            k++;
            j++;
        }
    }
    public static void mergesort(int arr[],int start,int end)
    {
        if(start< end)
        {
            int mid=start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr,mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    public static void main(String[] args) {
        int arr []= {45,85,2,1,55,4,8,7,2,10,1};

        mergesort(arr,0, arr.length-1);
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
