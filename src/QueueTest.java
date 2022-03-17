public class QueueTest {
    public static void main(String[] args) {
        LinkedListQueue linkedListQueue = new LinkedListQueue();
        linkedListQueue.enQueue("A");
        linkedListQueue.enQueue("B");
        linkedListQueue.enQueue("C");
        linkedListQueue.printQueue();
        System.out.println(linkedListQueue.deQueue());
        linkedListQueue.printQueue();
        System.out.println(linkedListQueue.deQueue());
        linkedListQueue.printQueue();

        // 결과
        // A added.
        // B added.
        // C added.
        // A->B->C
        // A deleted.
        // B->C
        // B deleted.
        // C
    }
}
