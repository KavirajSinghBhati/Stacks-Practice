package practice;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesis {
    public static void main(String[] args) {
        String str = "{}[{()}]", str2 = "({))";
        System.out.println(isBalanced(str));
        System.out.println(isBalanced(str2));
    }

    static boolean isMatching(char a, char b) {
        return ((a == '[' && b == ']') || a == '(' && b == ')' || a == '{' && b == '}');
    }

    static boolean isBalanced(String str) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                else if (!isMatching(stack.peek(), c))
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
// six possible characters in i/p string: ( , ), { , }, [ , ]
// whether this string contains balanced or not
// bracket which opens latest, closes first
