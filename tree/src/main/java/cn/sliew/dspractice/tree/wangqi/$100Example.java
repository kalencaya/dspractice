package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$100SameTreeExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

public class $100Example extends $100SameTreeExample {

    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        $100SameTreeExample example = new $100Example();
        Integer[] pNums = new Integer[]{2, 1, 3};
        Integer[] qNums = new Integer[]{2, 1, 3};
        TreeNode p = TreeNode.build(pNums);
        TreeNode q = TreeNode.build(qNums);
        boolean result = example.isSameTree(p, q);
        System.out.println(result);
    }
}
