import java.util.Scanner;
class Power
{
	public static void main(String[] args) 
	{
		int pow=0;
		int base=0;
		double  total;
		Scanner kb=new Scanner(System.in);
		try
		{
			System.out.println("Enter Base");
			base=kb.nextInt();
			System.out.println("Enter Power");
			pow=kb.nextInt();
		}
		catch(Exception e)
		{
			base=0;
			pow=0;
		}
		total=Math.pow(base,pow);
		System.out.println("Power="+total);
	}
}