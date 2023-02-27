import java.util.Scanner;
class Firstlast
{
	public static void main(String[] args) 
	{
		
		int i=0;
		String str[]=new String[3];
		Scanner kb=new Scanner(System.in);
		try
		{
			for( i=0;i<3;i++)
			{
				System.out.println("Enter Any String:="+(i+1));
				str[i]=kb.next();
			}
		}
		catch(Exception e)
		{
			str[i]="MANOHAR SINGH";
		}
		for(i=0;i<3;i++)
		{

			if((str[i].charAt(0)=='A'||str[i].charAt(0)=='a') && (str[i].charAt(str[i].length()-1)=='r'||str[i].charAt(str[i].length()-1)=='R'))
			{
				System.out.println("Total"+str[i]);
			}
		}
				
	}
}