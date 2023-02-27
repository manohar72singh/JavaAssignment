package DSA1M;

import java.util.HashMap;
import java.util.HashSet;

public class PairSum {
    //Method 1
    public static void findPairUsingArray(int arr[],int target)
    {
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.print(" Pair Find "+target+" = "+"["+arr[i]+","+arr[j]+"]");
                }
            }
        }
    }

    //Method 2
    public static void findPairUsingHasSet(int arr[],int target)
    {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i< arr.length;i++)
        {
            int temp = target-arr[i];
            if(hashSet.contains(temp))
            {
                System.out.println("pair with given target "+target+" is ("+arr[i]+","+temp+")");
            }
            hashSet.add(arr[i]);
        }
    }

    public static int [] findPairUsingHashMap(int arr[],int target)
    {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        int i,find;
        int result[]={0,0};
        for(i=0;i< arr.length;i++)
        {
            find=target-arr[i];
            if(hashMap.containsKey(find))
            {
                result[0]=i-1;
                result[1]=hashMap.get(find)-1;
                break;
            }
            else
                hashMap.put(arr[i],i );
        }
        return result;
    }
    // we can solve this 3 method

    //1. Array    timeComplexity =O(n*2)
    //            auxiliary space= 0(n)

    //2. HashSet  timeComplexity =O(n)
    //            auxiliary space= 0(n)

    //3. HashMap timeComplexity =O(n)
    //           auxiliary space= 0(n)
    public static void main(String[] args) {
        //
        int arr[]={3,2,3};
        int target=6;
        //findPairUsingHasSet(arr,target);
        //findPairUsingArray(arr,target);
        int ans[]= findPairUsingHashMap(arr,target);
        for(int i=0;i< ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
