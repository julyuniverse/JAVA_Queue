package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.addNode("A");
        linkedList.addNode("B");
        linkedList.addPositioningNode(2, "C");
        linkedList.deletePositioningNode(2);

        linkedList.printAll();

        // 결과
        // A->B
    }
}
