package DSA1M;

public class FindArray1or0 {
    public static int findNumberOf1or0(int arr[])
    {
        int countZero=0;
        int countOne=0;
        int ansCount=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]==0)
            {
                countZero++;
            }
            if(arr[i]==1)
            {
                countOne++;
            }
            if(countZero==countOne)
            {
                ansCount++;
                countOne=0;
                countZero=0;
            }
        }
        return ansCount;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,1};
        int n=findNumberOf1or0(arr);
        System.out.print(n);
    }
}
