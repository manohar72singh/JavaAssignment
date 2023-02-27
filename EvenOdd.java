import java.util.Scanner;
class EvenOdd
{
	public static void main(String[] args) 
	{
		int n;
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter Any Interger No:=");
		n=kb.nextInt();
		if(n%2==0)
		System.out.println(n+"is Even");
		else
		System.out.println(n+"is Odd");
	}
}