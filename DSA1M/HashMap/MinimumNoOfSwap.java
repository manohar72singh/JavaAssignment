package DSA1M.HashMap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MinimumNoOfSwap {
    public static int minSwap(int arr[]) {
        int len = arr.length;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < len; i++) {
            hashMap.put(arr[i],i);
        }
        Arrays.sort(arr);
        boolean visited[] = new boolean[len];
        Arrays.fill(visited, false);
        int ans =0;
        for (int i = 0; i < len; i++) {
            if(visited[i]|| hashMap.get(arr[i])==i)
                continue;
            int j=i, cycle_size=0;
            while (!visited[j])
            {
                visited[j]=true;
                j=hashMap.get(arr[j]);
                cycle_size++;
            }
            if(cycle_size>0)
            {
                ans+=(cycle_size-1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter no of Array");
        int n = kb.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++)
        {
            arr[i] = kb.nextInt();
        }
        int ans = minSwap(arr);
        System.out.println("Total no of swap="+ans);
    }
}
