import java.util.Scanner;
class ACshort
{
	public static void main(String[] args) 
	{
		int i,j,t;
		int arr[]=new int [10];
		int arr1[]=new int [10];
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

		//COPY ANOTHER ARRAY

		for(int k=0;k<10;k++)
		{
			arr1[k]=arr[k];
		}
		
		// code to shorting

		for(i=0;i<10;i++)
       	{
          	for(j=i+1;j<10;j++)
            {
           	  if(arr1[i]>arr1[j])
           		{
               		t=arr1[i];
               		arr1[i]=arr1[j];
               		arr1[j]=t;
           		}
            }
        }

        // code to print both array
        
		System.out.println("contest of array is(before sort):");
		for(int l:arr)
		{
			System.out.println(l);
		}

		System.out.println("contest of array is(After sort):");
		for(int m:arr1)
		{
			System.out.println(m);
		}
	}
}