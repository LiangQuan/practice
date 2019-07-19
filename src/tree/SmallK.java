package tree;

public class SmallK {
    public TreeNode pnode;
    public int num;

    public void preNode(TreeNode curNode, int k){
        if (curNode != null){
            preNode(curNode.getTreeLeft(), k);

            num++;
            if (num == k){
                pnode = curNode;
            }
            preNode(curNode.getTreeRight(), k);
        }
    }

    public TreeNode getKnode(TreeNode node, int k){
        preNode(node, k);
        return pnode;
    }
}
