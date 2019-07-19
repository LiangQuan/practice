package linklist;

import java.util.ArrayList;
import java.util.List;

public class mergeKLists {

    public Node getMergeList(ArrayList<Node> lists){

        if (lists == null || lists.size() == 0){
            return null;
        }

        return MergeList(lists, 0, lists.size() -1);
    }

    public Node MergeList(ArrayList<Node> lists, int start, int end){
        if (start >= end){
            return lists.get(start);
        }
        int mid = start + (end - start)/2;
        Node left = MergeList(lists, start, mid);
        Node right = MergeList(lists, mid+1, end);

        return mergeNode(left, right);
    }

    public Node mergeNode(Node left, Node right){
        Node head = new Node(-1);
        Node temp = head;
        while (left != null && right != null){
            if (left.getValue() > right.getValue()){
                temp.pnext = right;
                right = right.pnext;
            }else {
                temp.pnext = left;
                left = left.pnext;
            }
            temp = temp.pnext;
        }
        //判断是否链表还存在
        if (left != null){
            temp.pnext = left;
        }
        if (right != null){
            temp.pnext = right;
        }
        return head.pnext;
    }


    public static void main(String[] args){
        reverelist link1 = new reverelist();
        link1.addnode(1);
        link1.addnode(2);
        link1.addnode(4);
        link1.addnode(5);
        reverelist link2 = new reverelist();
        link2.addnode(3);
        link2.addnode(4);
        link2.addnode(7);
        link2.addnode(9);
        ArrayList<Node> lists= new ArrayList<Node>();
        lists.add(link1.getFirst());
        lists.add(link2.getFirst());
        mergeKLists res =  new mergeKLists();
        Node head = res.getMergeList(lists);
        link1.printAllbyhead(head);

    }
}
