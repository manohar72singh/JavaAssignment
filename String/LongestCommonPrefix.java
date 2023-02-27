package String;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String logestCommonPrefix(String s[])
    {
        int size=s.length;
        if(size==0)
            return "";
        if (size==1)
            return s[0];

        Arrays.sort(s);
        int end=Math.min(s[0].length(),s[size-1].length());
        int i=0;
        while(i < end && s[0].charAt(i) == s[size-1].charAt(i) )
            i++;
        String pre = s[0].substring(0, i);
        return pre;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("String array");
        int n=kb.nextInt();
        String s[]=new String[n];
        for (int i=0;i<n;i++)
        {
            s[i]=kb.next();
        }
        System.out.println( "The longest Common Prefix is : " +
                logestCommonPrefix(s));
    }
}
