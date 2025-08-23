package dsa.collections_linkedlist;

import dsa.linkedlist.Node;

import java.util.LinkedList;

public class RemoveAllOccurrence {
    public static Node removeAlloccurance(Node head, int value) {
        while (head != null && head.data.equals(value)){
            head = head.next;
        }
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (current.data.equals(value)) {
                prev.next = current.next;
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void displayList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("END");
    }

    public static void removeOccurrenceBuiltin(LinkedList<Integer> list, int value) {
        list.removeIf(n -> n == value);
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(2);

        System.out.println("Original list:");
        displayList(head);

        head = removeAlloccurance(head, 2);
        System.out.println("\nList after removing all occurrences of 2:");
        displayList(head);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(8);
        list.add(2);

        System.out.println("Original list: " + list);
        int valueToRemove = 2;
        removeOccurrenceBuiltin(list, valueToRemove);
        System.out.println("List after removing all occurrences of " + valueToRemove + ": " + list);
    }
}
