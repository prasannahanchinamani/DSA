package dsa.linkedlist;

public class LinkedListimp<T> {
    private Node<T> head;

    /////////-------Insertion
    // insertion starting addfirst
    public void push(T val) {
        Node newNode = new Node(val);
        if (isEmpty())
            head = newNode;
        else {
            Node<T> current = head; //current-head
            current = newNode;//current eg=3
            current.next = head;//current.next
            head = current;
        }
    }

    // insertion ending      addlast
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty())
            head = newNode;
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }

    }

    //insert at partcular Index
    public void insertAt(T value, int index) {
        Node<T> temp = head;
        Node<T> newNode = new Node<>(value);
        int count = 0;
        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }
        Node temp2 = temp.next;
        temp.next = newNode;
        newNode.next = temp2;

    }

    /////////-------deletion
    public T removeLast() {
        if (isEmpty())   // case: list is empty
            return null;

        if (head.next == null) {   // case: only one node
            T data = head.data;
            head = null;           // make list empty
            return data;
        }

        // case: more than one node
        Node<T> temp = head;
        while (temp.next.next != null) {  // stop at second last
            temp = temp.next;
        }

        T data = temp.next.data;
        temp.next = null;
        return data;
    }

    //remove first
    public T removeFirst() {
        if (isEmpty())
            return null;

        if (head.next == null) {
            T data = head.data;
            head = null;
            return data;
        }
        Node<T> temp = head;
        T result = temp.data;
        head = temp.next;
        return result;
    }

    // delete At index
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        }
        Node<T> temp = head;
        Node<T> prev = null;
        int count = 0;
        while (temp != null && count < index) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;

    }

    /// through array asssign
    public void convertArraytoLinkedlist(T arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            push(arr[i]);
        }
    }

    public void display_printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void  printList(Node<T> node){//node=head;
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    // for many class i can use this:
    public Node<T> getHead() {
        return head;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedListimp<Integer> list = new LinkedListimp<>();
        System.out.println(list.isEmpty());//
        list.push(1);
        list.push(2);
        list.push(3);
        list.add(4);
        list.insertAt(22, 1);
        list.display_printList();
        list.deleteAt(1);
        list.display_printList();
    }
}