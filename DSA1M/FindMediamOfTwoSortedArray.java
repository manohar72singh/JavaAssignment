package DSA1M;

public class FindMediamOfTwoSortedArray {
    public static double getMid(int arr[],int midIndex,boolean isEven)
    {
        if(isEven)
            return (double) (arr[midIndex]+arr[midIndex-1])/2;
        else
            return arr[midIndex];
    }
    public static double findMedianSortedArrays(int arr1[],int arr2[])
    {
        int n1= arr1.length;
        int n2 = arr2.length;
        int fl=n1+n2;
        int temp[]=new int[fl];
        int midIndex=0;
        boolean isEven=false;
        if(fl%2==0)
        {
            isEven=true;
            midIndex=((fl/2)+1)-1;
        }
        else
        {
            midIndex=((fl+1)/2)-1;
        }
        if(n1!=0 && n2==0)
        {
            return getMid(temp,midIndex,isEven);
        }
        else if(n2!=0 && n1==0)
        {
            return getMid(temp,midIndex,isEven);
        }
        else
        {
            int index1=0;
            int index2=0;
            int finalIndex=0;
            while (index1<n1 && index2<n2 && finalIndex<=midIndex)
            {
                if(arr1[index1]<arr2[index2])
                {
                    temp[finalIndex]=arr1[index1];
                    index1++;
                }
                else
                {
                    temp[finalIndex]=arr2[index2];
                    index2++;
                }
                finalIndex++;
            }
            while (index1<n1 && finalIndex<=midIndex)
            {
                temp[finalIndex]=arr1[index1];
                index1++;
                finalIndex++;
            }
            while (index2<n2 && finalIndex<=midIndex)
            {
                temp[finalIndex]=arr2[index2];
                index2++;
                finalIndex++;
            }
            return getMid(temp,midIndex,isEven);
        }
    }

    public static void main(String[] args) {
        int arr1[]={1,3};
        int arr2[]=  {2};
        double ans = findMedianSortedArrays(arr1,arr2);
        System.out.print(ans);
    }
}
