package tree;

public class HandleTree {
    public TreeNode root;
    public void buildTree(int[] treeval){
        int len = treeval.length;
        TreeNode temp;
        for (int i = 0; i < len; i++){
            this.root = new TreeNode(treeval[i]);
        }
    }
}
