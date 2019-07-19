package tree;

import java.util.Stack;

public class postordertree {
    public void postorder(TreeNode root){
        if (root != null){
            postorder(root.getTreeLeft());
            postorder(root.getTreeRight());
            System.out.println(root.getNodeValue());
        }
    }

    //非递归形式
    public void postorderstack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        TreeNode cur = root;
        while (!stack.empty()){
            if (cur.getTreeRight()!=null){
                stack.push(cur.getTreeRight());
            }
            if (cur.getTreeLeft()!=null){
                stack.push(cur.getTreeLeft());
            }
            cur = stack.pop();
            System.out.println(cur.getNodeValue());
        }
    }
}
