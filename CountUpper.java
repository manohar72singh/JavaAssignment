import java.util.Scanner;   
class CountUpper
{
	public static void main(String[] args) 
	{
		int upper=0;
		String str= new String();
		Scanner kb=new Scanner(System.in);
		try
		{
		System.out.println("Enter Any String:=");
		str=kb.next();
		}
		catch(Exception e)
		{  
			str="MANU";
		}
		for(int i=0;i< str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=65 && ch<=96)
			{
				upper++;
			}
		}
		System.out.println("TOTAL NO OF upper case:="+upper);
	}
}