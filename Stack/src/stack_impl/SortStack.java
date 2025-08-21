package stack_impl;

import java.util.Stack;

public class SortStack {
    public static void sort(Stack<Integer> stack) {
        Stack<Integer> tempstack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempstack.isEmpty() && tempstack.peek() < temp) {
                stack.push(tempstack.pop());
            }
            /*
            descending
            while (!tempstack.isEmpty() && tempstack.peek() > temp) {
                stack.push(tempstack.pop());
            }
            */
            tempstack.push(temp);
        }
        while (!tempstack.isEmpty()) {
            stack.push(tempstack.pop());
            ;
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original: " + stack);

        sort(stack);

        System.out.println("Sorted: " + stack);
    }
}
