package linklist;

public class reverelist {
    private Node root = null;
    private Node last = null;
    public void addnode(int data){
        Node newnode = new Node(data);
        if (this.root == null){
            this.root = newnode;
            this.last = newnode;
        }else {
            this.last.setNext(newnode);
            this.last = newnode;
        }

    }
    public Node getFirst(){
        return this.root;
    }
    public void printAll(){
        if (this.root == null){System.out.println("Node no data");return;}
        Node temp = this.root;
        while (temp != null){
            System.out.println(temp.getValue());
            temp = temp.pnext;
        }
    }
    public void printAllbyhead(Node head){
        while (head != null){
            System.out.println(head.getValue());
            head = head.pnext;
        }
    }
    public Node reverseLink(){
        Node pcurrent,ppnext,ppre;
        pcurrent = this.root;
        ppre = null;
        while (pcurrent != null){
            ppnext = pcurrent.pnext;
            //判断是否是最后一个节点
            if (ppnext == null){
                pcurrent.pnext = ppre;

            }
        }
        return pcurrent;
    }
    /**
     * 将单链表倒着输出
     */
    public void revereLink(Node node){
        if (node.getValue() == 0){System.out.println("Node no data");return;}
        if (node.pnext != null){
            revereLink(node.pnext);
        }
        System.out.println(node.getValue());

    }
    public static void main(String[] args){
        reverelist link = new reverelist();
        link.addnode(1);
        link.addnode(2);
        link.addnode(4);
        link.addnode(5);
        System.out.println("-------正向输出-------");
        link.printAll();
        System.out.println("-------逆向输出-------");
        Node first = link.getFirst();
        link.revereLink(first);

    }

}
