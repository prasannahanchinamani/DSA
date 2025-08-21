package stack_impl;
class StackArray {
    private char[] arr;
    private int top;
    private int capacity;

    StackArray(int size) {
        capacity = size;
        arr = new char[size];
        top = -1;
    }


    void push(char c) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack overflow");
        }
        arr[++top] = c;
    }


    char pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return arr[top--];
    }


    char peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

 
    boolean isEmpty() {
        return top == -1;
    }
}

public class ValidParenthesesIntStack {
    public static boolean isValid(String s) {
        StackArray stack = new StackArray(s.length());

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Driver method
    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[()]}";

        System.out.println(test1 + " -> " + isValid(test1)); // true
        System.out.println(test2 + " -> " + isValid(test2)); // false
        System.out.println(test3 + " -> " + isValid(test3)); // true
    }
}
