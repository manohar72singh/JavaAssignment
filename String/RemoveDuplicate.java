package String;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter any String:=");
        String str=kb.nextLine();
        int arr[]=new int[26];

        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }

        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)-'a']!=0)
            {
                System.out.print(str.charAt(i));
                arr[str.charAt(i)-'a']=0;
            }
        }
    }
}
