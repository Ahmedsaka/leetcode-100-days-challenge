package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid2("()"));
    }

    static boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') stack.push(ch);
            else if(stack.isEmpty() && (ch == ')' || ch == ']' || ch == '}')) return false;
            else if (ch == ')' && stack.peek() == '(') stack.pop();
            else if (ch == ']' && stack.peek() == '[') stack.pop();
            else if (ch == '}' && stack.peek() == '{') stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }

    static boolean isValid2(String s) {
        Stack<Character> bracketStack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                bracketStack.push(s.charAt(i));
            } else {
                if (bracketStack.size() == 0) return false;
                char current = s.charAt(i);
                if (isClosedBracket(bracketStack.peek(), current)) {
                    bracketStack.pop();
                } else return false;
            }
        }

        return bracketStack.isEmpty() ? true : false;
    }

    static boolean isClosedBracket(char open, char closed) {
        if ((open == '{' && closed == '}') ||
                (open == '[' && closed == ']') ||
                (open == '(' && closed == ')')) {
            return true;
        }
        return false;
    }
}
