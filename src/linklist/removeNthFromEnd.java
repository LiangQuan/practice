package linklist;

public class removeNthFromEnd {

    public Node removeNode(Node head , int n){
        //一般牵扯到链表倒数第几个这种，都会用到双指针
        Node first = new Node(-1);
        first.pnext = head;
        Node temp = first, slow = head, fast = head;
        for (int i = 0; i <= n ; i++){
            fast = fast.pnext;
        }
        while (fast != null){
            slow = slow.pnext;
            fast = fast.pnext;
        }
        temp = slow.pnext;
        slow.pnext = slow.pnext.pnext;
        return first.pnext;
    }

    public static void main(String[] args){
        reverelist link = new reverelist();
        link.addnode(1);
        link.addnode(2);
        link.addnode(4);
        link.addnode(5);
        removeNthFromEnd res = new removeNthFromEnd();
        Node newnode = res.removeNode(link.getFirst(), 2);
        link.printAllbyhead(newnode);
    }
}
