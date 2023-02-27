// FIND 2ND BIGEEST NO IN ARRAY
import java.util.Scanner;
class SecBigeest
{
	public static void main(String[] args) 
	{
		int big1,big2,i;
		int arr[]=new int [10];
		Scanner kb=new Scanner(System.in);

		// code to input data
		for(i=0;i<10;i++)
		{
			try
			{
				System.out.println("Enter Array"+(i+1));
				arr[i]=kb.nextInt();
			}
			catch(Exception e)
			{
				arr[i]=0;
			}
		}

		//code to find 2nd big data

		big1=arr[0];
		for(i=0;i<10;i++) 
		{
        	if (arr[i]>big1) 
            {
               big1=arr[i];
        	}
        }

        big2=arr[0];
        for(i=1;i<10;i++) 
        {
            if(arr[i]>big2 && arr[i]<big1)
            big2=arr[i];
        }
       System.out.println("2ND BIG DATA="+big2); 
	}
}