package DSA1M;

public class FindSmallestMissingNo {
    public static int findMissingNo(int arr[],int left,int right)
    {
        if(left>right)
            return left;
        int mid=left+(right-left)/2;
        if(arr[mid]==mid)
        {
            return findMissingNo(arr,mid+1,right);
        }
        else
        {
            return findMissingNo(arr,left,mid-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,1,0,4,6};
        int left =0;
        int right= arr.length-1;
        int ans=findMissingNo(arr,left,right);
        System.out.print(ans);
    }
}
