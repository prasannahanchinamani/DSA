package stack_impl;

import java.util.Arrays;

public class NextGreater {
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);

        StackimpArray stack = new StackimpArray(n);
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.peek()] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 7, 8};
        int[] result = nextGreater(arr);

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}
