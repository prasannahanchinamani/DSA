package stack_impl;

public class StackLL<T> {
    private Node<T> head;  // top of the stack
    private int size;

    public StackLL() {

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() {
//        Node<T> newNode=new Node<>(data);
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        T popped = head.data;
        head = head.next;
        return popped;
    }

    public T peek() {
//        Node<T> newNode=new Node<>(data);
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return head.data;
    }

    public int size() {
        return size;
    }

}
