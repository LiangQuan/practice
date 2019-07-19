package tree;

public class TreeNode {

    private int NodeValue;

    private TreeNode TreeLeft;
    private TreeNode TreeRight;

    /**
     * 构造函数，给树节点赋值
     * @param treeNode
     */
    public TreeNode(int treeNode){
        this.NodeValue = treeNode;
    }

    /**
     *
     * @return
     */
    public int getNodeValue(){
        return this.NodeValue;
    }

    /**
     *
     * @param treeLeft
     */
    public void setTreeLeft(TreeNode treeLeft){
        this.TreeLeft = treeLeft;
    }
    /**
     *
     * @param treeLeft
     */
    public TreeNode getTreeLeft(){
        return this.TreeLeft;
    }
    /**
     *
     * @param treeLeft
     */
    public TreeNode getTreeRight(){
        return this.TreeRight;
    }
    /**
     *
     * @param treeRight
     */
    public void setTreeRight(TreeNode treeRight){
        this.TreeRight = treeRight;
    }
}
