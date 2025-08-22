package linkedlist;

public class SortLinkedList {
    private Node<Integer> head;

    public SortLinkedList(Node<Integer> head) {
        this.head = head;
    }

    // Merge Sort on linked list
    public Node<Integer> sort(Node<Integer> list) {
        if (list == null || list.next == null)
            return list;

        Node<Integer> mid = getMiddle(list);
        Node<Integer> right = mid.next;
        mid.next = null;

        Node<Integer> leftSorted = sort(list);
        Node<Integer> rightSorted = sort(right);

        return mergeTwoSortedList(leftSorted, rightSorted);
    }

    // Merge two sorted linked lists
    public Node<Integer> mergeTwoSortedList(Node<Integer> list1, Node<Integer> list2) {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) temp.next = list1;
        if (list2 != null) temp.next = list2;

        return dummy.next;
    }

    // Find middle node
    public Node<Integer> getMiddle(Node<Integer> head) {
        if (head == null) return head;
        Node<Integer> slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        LinkedListimp<Integer> list1 = new LinkedListimp<>();
        list1.add(4);
        list1.add(2);
        list1.add(1);
        list1.add(3);

        LinkedListimp<Integer> list2 = new LinkedListimp<>();
        list2.add(7);
        list2.add(2);
        list2.add(3);
        list2.add(5);

        System.out.println("Original List 1:");
        list1.display_printList();
        System.out.println("Original List 2:");
        list2.display_printList();

        SortLinkedList sorter1 = new SortLinkedList(list1.getHead());
        SortLinkedList sorter2 = new SortLinkedList(list2.getHead());

        Node<Integer> sorted1 = sorter1.sort(list1.getHead());
        Node<Integer> sorted2 = sorter2.sort(list2.getHead());

        Node<Integer> merged = sorter1.mergeTwoSortedList(sorted1, sorted2);


        System.out.println("Merged Sorted List:");
        Node<Integer> temp = merged;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
