package dsa.collections.collection_stack;

import java.util.Stack;

public class PostFixExpression_evaluation {
    public static int postFixExpression_evaluation(String expression) {
        Stack<Integer> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
               stack.push(Character.getNumericValue(ch));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                switch (ch) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                }
                stack.push(result);
            }
        }
        return  stack.pop();
    }

    public static void main(String[] args) {
        String expr1 = "231*+9-"; // (2 + (3*1)) - 9
        System.out.println("Postfix: " + expr1 + " = " + postFixExpression_evaluation(expr1));
    }
}
