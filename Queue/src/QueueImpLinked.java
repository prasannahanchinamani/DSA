public class QueueImpLinked {
    public static void main(String[] args) {
        QueueL<Integer> intQueue = new QueueL<>();
        intQueue.push_enque(10);
        intQueue.push_enque(20);
        intQueue.push_enque(30);
        intQueue.display();
        System.out.println("Dequeued: " + intQueue.pop_deque());
        intQueue.display();
        System.out.println("Front element: " + intQueue.peek());
    }
}

