package linkedlist;

public class LinkedList {
    // 멤버 변수
    private Node head;
    public int size;

    // 생성자
    public LinkedList() {
        head = null;
        size = 0;
    }

    // 순차적인 노드 추가
    public void addNode(String data) {
        Node newNode;
        newNode = new Node(data);

        if (head == null) { // head가 null이라면 (첫 삽입이라면)
            head = newNode;
        } else {
            Node tmpNode = head;

            while (tmpNode.nextLink != null) {
                tmpNode = tmpNode.nextLink;
            }

            tmpNode.nextLink = newNode;
        }

        size++;
    }

    // 위치 지정 노드 추가
    public void addPositioningNode(int index, String data) {
        if (index < 0 || index > size) {
            System.out.println("Check the index position.");
            return;
        }

        Node newNode = new Node(data);
        Node tmpNode = head;

        if (index == 0) {
            newNode.nextLink = head;
            head = newNode;
        } else {
            Node prevNode = null; // 임시로 기존 노드를 담아둔다.

            for (int i = 0; i < index; i++) {
                prevNode = tmpNode;
                tmpNode = tmpNode.nextLink;
            }

            prevNode.nextLink = newNode; // 임시 기존 노드 다음으로 새로운 노드 연결
            newNode.nextLink = tmpNode; // 새로운 노드 다음으로 임시 기존 노드의 다음 노드 연결
        }

        size++;
    }

    // 위치 지정 노드 삭제
    public void deletePositioningNode(int index) {
        if (isEmpty()) {
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Check the index position.");
            return;
        }

        Node tmpNode = head;
        Node prevNode = null;  // 임시로 기존 노드를 담아둔다.

        if (index == 0) {
            head = head.nextLink;
        } else {
            for (int i = 0; i < index; i++) {
                prevNode = tmpNode;
                tmpNode = tmpNode.nextLink;
            }

            prevNode.nextLink = tmpNode.nextLink; // 임시 기존 노드 다음으로 다음 노드의 다음 노드 연결
        }

        size--;
    }

    // 비었는지 확인
    public boolean isEmpty() {
        if (head == null) {
            System.out.println("The array is empty.");
            return true;
        } else {
            return false;
        }
    }

    // 모두 출력
    public void printAll() {
        Node tmpNode = head;

        while (tmpNode != null) {
            System.out.print(tmpNode.getData());
            tmpNode = tmpNode.nextLink;
            if (tmpNode != null) {
                System.out.print("->");
            }
        }

        System.out.println("");
    }
}
