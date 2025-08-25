package dsa.collections_linkedlist;

import dsa.linkedlist.Node;

public class LinkedListCycleDetector {
    public Node detectCycle(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListCycleDetector detector = new LinkedListCycleDetector();

        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(-4);

        // Create a cycle
        head.next.next.next.next = head.next;

        Node cycleStart = detector.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.data);
        } else {
            System.out.println("No cycle detected.");
        }
    }
}
