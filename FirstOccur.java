import java.util.Scanner;

public class FirstOccur {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s1 = kb.nextLine();
        s1.toLowerCase();
        System.out.println("Enter any Latter(A to Z)");
        char ch = kb.nextLine().charAt(0);

        for (int i=0;i<s1.length();i++)
        {
            char c = s1.charAt(i);
            if(c==ch)
            {
                System.out.print(s1.substring(i+1,s1.length()));
                break;
            }
            
        }
    }
}
