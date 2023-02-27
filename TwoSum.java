import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        System.out.print("Enter number of Array");
        int n= kb.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.print("Enter target");
        int target=kb.nextInt();
        for (int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println(arr[i]+","+arr[j]);

                }
                break;
            }
        }
    }
}
