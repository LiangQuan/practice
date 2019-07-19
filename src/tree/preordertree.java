package tree;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class preordertree {
    public void pretree(TreeNode root){
        System.out.println(root.getNodeValue());
        TreeNode leftNode = root.getTreeLeft();
        if (leftNode != null){
            pretree(leftNode);
        }
        TreeNode rightNode = root.getTreeRight();
        if (rightNode != null){
            pretree(rightNode);
        }
    }
    //非递归实现
    public void pretreestack(TreeNode root){
       Stack<TreeNode> stack = new Stack<TreeNode>();
       stack.push(root);
       while (!stack.empty()){
           TreeNode cur = stack.pop();
           System.out.println(cur.getNodeValue());
           if (cur.getTreeRight() != null){
               stack.push(cur.getTreeRight());
           }
           if (cur.getTreeLeft() != null){
               stack.push(cur.getTreeLeft());
           }

       }
    }
}
