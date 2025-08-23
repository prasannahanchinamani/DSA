package dsa.collections.collection_stack;

import java.util.Stack;

public class ValidParenthis {
    public static boolean validate(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (ch == '(') stack.push(')');
            else {
                if (stack.isEmpty() || stack.pop()!=ch)
                    return false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        String expresion="{}[()]";
        System.out.println(validate(expresion));
    }
}
