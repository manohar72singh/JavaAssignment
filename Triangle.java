import java.util.Scanner;
class Triangle
{
	public static void main(String[] args) 
	{
		float a,b,c,s,area;
		Scanner kb=new Scanner(System.in);
		try
		{
			System.out.println("Enter 1st Side:-");
			a=kb.nextInt();
			System.out.println("Enter 2nd Side:-");
			b=kb.nextInt();
			System.out.println("Enter 3rd Side:-");
			c=kb.nextInt();
		}
		catch(Exception e)
		{
			a=0;
			b=0;
			c=0;
		}
		s=(a+b+c)/2;
		System.out.println(s);
		area=(float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area Of Tringle="+area);
	}
}