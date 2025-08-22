package linkedlist;

public class SearchElement<T> {
    private Node<T> head;

    public SearchElement(Node<T> head) {
        this.head = head;
    }

    public int Search(T target) {
        Node<T> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(target))
                return index;
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public int binarySearch(Node<Integer> head, int target) {
        Node<Integer> start = head;
        Node<Integer> end = null;

        while (start != end) {
            Node<Integer> mid = getMiddle(start, end);

            if (mid == null) return -1;

            if (mid.data == target) {
                int index = 0;
                Node<Integer> temp = head;
                while (temp != mid) {
                    index++;
                    temp = temp.next;
                }
                return index;
            } else if (mid.data < target) {
                start = mid.next; // search right half
            } else {
                end = mid; // search left half
            }
        }
        return -1;
    }


    public Node<Integer> getMiddle(Node<Integer> start, Node<Integer> end) {
        if (start == null) return null;

        Node<Integer> slow = start;
        Node<Integer> fast = start;

        while (fast.next != end && fast.next.next != end) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        LinkedListimp<Integer> list = new LinkedListimp<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        SearchElement<Integer> seach = new SearchElement<>(list.getHead());
        System.out.println(seach.Search(10));
        System.out.println(seach.binarySearch(list.getHead(),10));
    }
}
