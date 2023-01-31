package Solution1;

import java.util.ArrayDeque;
import java.util.Deque;

public class UsingDeque {
    /**
     * Method to check if brackets are balanced
     */

    static boolean areBracketsBalance(String b){
        Deque<Character> deque = new ArrayDeque<Character>();

        for (int i=0; i< b.length(); i++){
            char x = b.charAt(i);

            if (x == '(' || x == '{' || x == '['){
                deque.push(x);
                continue;
            }

            if (deque.isEmpty()){
                return false;
            }
            char check;
            switch (x) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = deque.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;

            }
        }
        return deque.isEmpty();

    }
    public static void main(String[] args) {

        String brackets = "{([}";

        if (areBracketsBalance(brackets))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");

    }
}
