package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String str)
    {
        Map<Character,Character> parenthesesMapping = new HashMap<>();
        parenthesesMapping.put('(', ')');
        parenthesesMapping.put('{', '}');
        parenthesesMapping.put('[', ']');
        Stack<Character> parentheses = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(parenthesesMapping.containsKey(c)) {
                parentheses.push(c);
            } else {
                if(parentheses.isEmpty()) {
                    return false;
                }
                char target = parentheses.pop();
                if(!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != c) {
                    return false;
                }
            }
        }
        if(!parentheses.isEmpty()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter Parentheses");
        String p=kb.nextLine();
        //System.out.println(isValid("()"));
        System.out.println(isValid(p));
    }
}
