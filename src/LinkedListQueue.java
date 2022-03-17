interface Queue {
    public void enQueue(String data);

    public String deQueue();

    public void printQueue();
}

public class LinkedListQueue implements Queue {
    Node front;
    Node rear;

    @Override
    public void enQueue(String data) {
        Node newNode = new Node(data);


        if (isEmpty()) {
            front = newNode;
        } else {
            if (front.nextLink == null) {
                rear = newNode;
                front.nextLink = rear;
            } else {
                rear.nextLink = newNode;
                rear = rear.nextLink;
            }
        }

        System.out.println(newNode.getData() + " added.");
    }

    @Override
    public String deQueue() {
        if (isEmpty()) {
            return null;
        }

        String data = front.getData();
        front = front.nextLink;

        if (front == null) {
            rear = null;
        }

        return data + " deleted.";
    }

    @Override
    public void printQueue() {
        Node tmpNode = front;

        while (tmpNode != null) {
            System.out.print(tmpNode.getData());

            if (tmpNode.nextLink != null) {
                System.out.print("->");
            }

            tmpNode = tmpNode.nextLink;
        }

        System.out.println("");
    }

    public boolean isEmpty() {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }
}
