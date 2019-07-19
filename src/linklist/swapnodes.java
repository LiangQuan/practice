package linklist;

import tree.TreeNode;

public class swapnodes {


    public Node getSwapnode(Node link){
        //首先定义一个头结点
        Node start = new Node(0);
        start.pnext = link;
        for (Node cur = start; cur.pnext != null && cur.pnext.pnext != null; cur = cur.pnext.pnext){
            cur.pnext = swap(cur.pnext, cur.pnext.pnext);
        }
        return start.pnext;
    }
    public Node swap(Node head1, Node head2){
        head1.pnext = head2.pnext;
        head2.pnext = head1;
        return head2;
    }

    public static void main(String[] args){
        reverelist link = new reverelist();
        link.addnode(1);
        link.addnode(2);
        link.addnode(4);
        link.addnode(5);
        link.printAll();
        swapnodes res = new swapnodes();
        Node head = res.getSwapnode(link.getFirst());

        link.printAllbyhead(head);
    }
}
