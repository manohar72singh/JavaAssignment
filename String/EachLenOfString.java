package String;

import java.util.Scanner;

public class EachLenOfString {
    public static void count(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            String s="";
            while (i<ch.length && ch[i]!=' ')
            {
                s=s+ch[i];
                i++;
            }
            if (s.length()>0)
            {
                System.out.println(s+"->"+s.length());
            }
        }
    }
    public static void main(String[] args) {

        String str="hii this is manohar";
        count(str);
        System.out.println("===============");
        for(int i=0;i<str.length();i++)
        {
            String s="";
            while(i<str.length() && str.charAt(i)!=' ')
            {
                s=s+str.charAt(i);
                i++;
            }
            if (s.length()>0)
            {
                System.out.println(s+"->"+s.length());
            }
        }
    }
}
