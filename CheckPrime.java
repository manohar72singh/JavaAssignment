import java.util.Scanner;
class CheckPrime
{
	public static void main(String[] args) 
	{
	 	int n,i,count=0;
	 	Scanner kb=new Scanner(System.in);
	 	try
	 	{
	 	System.out.println("Enter Any Interger No:=");
	 	n=kb.nextInt();
	 	}
	 	catch(Exception e)
	 	{
	 		n=1;
	 	}
	 	for(i=2;i<n/2;i++)
	 	{
	 		if(n%1==0)
	 		{
	 			count++;
	 			break;
	 		}
	 	}
	 		if(count==0)
	 		{
	 			System.out.println(n+" Is Prime No");	
	 		}
	 		else
	 		{
	 			System.out.println(n+" Is Not Prime No");
	 		}	 		
	}
}
