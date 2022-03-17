public class Node {
    // 멤버 변수
    private String data; // 자료
    public Node nextLink; // 다음 노드를 가리키는 링크

    // 생성자
    public Node() {
        data = null;
        nextLink = null;
    }

    // 생성자
    public Node(String data) {
        this.data = data;
        this.nextLink = null;
    }

    public String getData() {
        return data;
    }
}
