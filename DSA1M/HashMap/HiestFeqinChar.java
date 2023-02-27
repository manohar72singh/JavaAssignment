package DSA1M.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class HiestFeqinChar {

    //USING 2 METHOD
    //1. ARRAY
    //2. HASHMAP
    public static void findHighestFreqUsingArrayMethod(String s)
    {
        int arr[]= new int[256];
        int max=-1;
        String c= "";
        for (int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        for(int i=0;i<s.length();i++)
        {
            if(max<arr[s.charAt(i)])
            {
                max=arr[s.charAt(i)];
                c= String.valueOf(s.charAt(i));
            }
        }
        System.out.print("Charter=> "+c+" Is Maximum frequency=> "+max );
    }

    public static void findHighestFreqUsingHashMapMethod(String s)
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            if(hashMap.containsKey(s.charAt(i)))
            {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
            else
            {
                hashMap.put(s.charAt(i),1);
            }

        }
        char max = s.charAt(0);
        int tr = 0;
        for(int i=0;i<s.length();i++)
        {
            if(hashMap.get(s.charAt(i))>hashMap.get(max))
            {
                max=s.charAt(i);
                tr=hashMap.get(s.charAt(i));
            }
        }
        System.out.println("Maximum Repeted Char "+max + " Total repete=" +tr);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter any String");
        String s=sc.nextLine();
        //findHighestFreqUsingArrayMethod(s);
        findHighestFreqUsingHashMapMethod(s);
    }
}
