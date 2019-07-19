package tree;

import java.util.LinkedList;
import java.util.Queue;

public class rowtree {
    public void printTree(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        TreeNode temp ;
        while (!queue.isEmpty()){
            temp = queue.poll();
            System.out.println(temp.getNodeValue());
            if (temp.getTreeLeft() != null){
                queue.add(temp.getTreeLeft());
            }
            if (temp.getTreeRight() != null){
                queue.add(temp.getTreeRight());
            }
        }
    }
}
