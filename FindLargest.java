import java.util.Scanner;
class FindLargest
{
	public static void main(String[] args) 
	{
		int a,b,c,largest;
		Scanner kb=new Scanner(System.in);
		try
		{
			System.out.println("ENTER 1ST NO:-");
			a=kb.nextInt();
			System.out.println("ENTER 2ND NO:-");
			b=kb.nextInt();
			System.out.println("ENTER 3RD NO:-");
			c=kb.nextInt();
		}
		catch(Exception e)
		{
			a=123;
			b=231;
			c=321;
		}
		largest=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("Largest 3no of="+largest);
	}
}