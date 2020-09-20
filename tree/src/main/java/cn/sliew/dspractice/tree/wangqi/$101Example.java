package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$101SymmetricTreeExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

public class $101Example extends $101SymmetricTreeExample {

    @Override
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            return left.val == right.val && isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
        }
        return false;
    }

    public static void main(String[] args) {
        $101SymmetricTreeExample example = new $101Example();
        Integer[] nums = new Integer[]{1, 2, 2, 3, 4, 4, 3};
        TreeNode root = TreeNode.build(nums);
        boolean result = example.isSymmetric(root);
        System.out.println(result);
    }
}
