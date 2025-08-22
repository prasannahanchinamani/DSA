package linkedlist;

public class Cycle_detection<T> {
    private Node<T> head;

    public Cycle_detection(Node<T> head) {
        this.head = head;
    }

    public boolean hasCycle() {
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public void  printList(Node<T> node){//node=head;
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    public void make_cycle( int position){
        if (head == null) return;

        Node<T> temp = head;
        Node<T> cycleNode = null;
        int index = 0;
        while (temp.next!=null){
            if(position==index)
                cycleNode=temp;
            temp=temp.next;
            index++;
        }
        if (cycleNode!=null){
            temp.next=cycleNode;
        }

    }

    public static void main(String[] args) {
        LinkedListimp<Integer> list = new LinkedListimp<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Cycle_detection<Integer> cycle = new Cycle_detection<>(list.getHead());
        System.out.println("has cycle:"+ cycle.hasCycle());
        cycle.printList(list.getHead());
        cycle.make_cycle(1);//give 1st last node connect to 1st
        System.out.println("has cycle:"+ cycle.hasCycle());
    }
}
