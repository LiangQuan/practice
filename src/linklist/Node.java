package linklist;

/**
 * 用来串讲链表的类
 */
public class Node {

    private int value;
    public Node pnext;
    public Node pre;

    public Node(int value){
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void addNode(Node node){
        if (this.pnext == null){
            this.pnext = node;
        }else{
            this.pnext.addNode(node);
        }
    }
    public void setNext(Node next){
        this.pnext = next;
    }
}
