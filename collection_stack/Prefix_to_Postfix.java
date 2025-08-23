package dsa.collections.collection_stack;

import java.util.Stack;

public class Prefix_to_Postfix {
    private static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String predix_postfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            } else if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop());
                stack.pop();
            } else {
                while(!stack.isEmpty()&&precedence(stack.peek())>=precedence(ch)){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String expr1 = "A+B*C";
        String expr2 = "(A+B)*C";
        predix_postfix(expr1);
        System.out.println(expr1 +" ="+predix_postfix(expr1));
        System.out.println(expr2+" ="+predix_postfix(expr2));
    }
}
