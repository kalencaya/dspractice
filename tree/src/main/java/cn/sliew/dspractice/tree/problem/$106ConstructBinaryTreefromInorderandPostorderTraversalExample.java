package cn.sliew.dspractice.tree.problem;

import java.util.List;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal medium
 * tags: Array, Tree, Depth-first Search
 */
public class $106ConstructBinaryTreefromInorderandPostorderTraversalExample {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return null;
    }

    public static void main(String[] args) {
        $106ConstructBinaryTreefromInorderandPostorderTraversalExample example =
                new $106ConstructBinaryTreefromInorderandPostorderTraversalExample();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = example.buildTree(inorder, postorder);

        $102BinaryTreeLevelOrderTraversalExample levelTraversal =
                new $102BinaryTreeLevelOrderTraversalExample();
        List<List<Integer>> result = levelTraversal.levelOrder(root);
        System.out.println(result);
    }
}
