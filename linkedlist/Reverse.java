package linkedlist;
public class Reverse<T> {
    private Node<T> head;
    public Reverse(Node<T> head) {
        this.head = head;
    }
    public Node<T> reverse() {
        Node<T> curr = head, prev = null, next = null;
        while (curr != null) {   //1 2 3         // Iteration 1: curr=1, prev=null, next=null
            next = curr.next;    // save 2       // Iteration 2: curr=2, prev=1, next=3
            curr.next = prev;    // 1->null      // Iteration 3: curr=3, prev=2->1, next=null
            prev = curr;         // prev=1       // after loop ends: prev=3->2->1
            curr = next;         // curr=2        // curr=null stops
        }
        head = prev;
        return head;
    }
    public void printList(Node<T> node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Reverse<Integer> list=new Reverse<>();
        LinkedListimp<Integer> list = new LinkedListimp<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display_printList();
        Reverse<Integer> rev = new Reverse<>(list.getHead());
        Node<Integer> newHead = rev.reverse();
        rev.printList(newHead);

    }
}
