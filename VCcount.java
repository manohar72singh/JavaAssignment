// PROGRAM TO COUNT HOW MANY VOWELS & CONSONANTS IN A STRING
import java.util.Scanner;
class VCcount
{
	public static void main(String[] args) 
	{
		int v=0;
		int c=0;
		int t=0;
		String str=new String();
		Scanner kb=new Scanner(System.in);
		
		try
		{
			System.out.println("Enter Any String:=");
			str=kb.next();
		}
		catch(Exception e)
		{
			str="SINGH";
		}

		str=str.toLowerCase();
		
		for(int i=0;i< str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				v++;
			}	
			else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
			{
				c++;
			}
		}
		t=str.length();
		System.out.println("TOTAL NO OF String:="+t);
		System.out.println("TOTAL NO OF VOWEL:="+v);
		System.out.println("TOTAL NO OF CONSO:="+c);
	}
}