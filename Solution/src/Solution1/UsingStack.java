package Solution1;

import java.util.Stack;

public class UsingStack {
    /**
     * Method to check if brackets are balanced
     */

    static boolean areBracketsBalance(String b){
        Stack<Character> stack = new Stack<Character>();

        for (int i=0; i< b.length(); i++){
            char x = b.charAt(i);

            if (x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;

            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {

        String brackets = "{()[]}";

        if (areBracketsBalance(brackets))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }
}
