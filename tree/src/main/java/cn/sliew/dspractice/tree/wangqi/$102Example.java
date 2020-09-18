package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$102BinaryTreeLevelOrderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class $102Example extends $102BinaryTreeLevelOrderTraversalExample {

    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        List<TreeNode> list = new LinkedList<>();
        List<Integer> tempResult = new LinkedList<>();
        list.add(root);
        list.add(null);
        while (!list.isEmpty()) {
            TreeNode node = list.remove(0);
            if (node == null) {
                if (list.isEmpty() || list.get(0) == null) {
                    result.add(tempResult);
                } else {
                    list.add(null);
                    result.add(tempResult);
                    tempResult = new LinkedList<>();
                }
            } else {
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
                tempResult.add(node.val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        $102BinaryTreeLevelOrderTraversalExample example = new $102Example();
        Integer[] nums = new Integer[]{1, 2};
        TreeNode root = TreeNode.build(nums);
        List<List<Integer>> result = example.levelOrder(root);
        System.out.println(result);
    }
}
