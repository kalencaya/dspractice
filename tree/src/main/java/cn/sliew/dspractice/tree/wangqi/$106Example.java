package cn.sliew.dspractice.tree.wangqi;

import cn.sliew.dspractice.tree.problem.$102BinaryTreeLevelOrderTraversalExample;
import cn.sliew.dspractice.tree.problem.$106ConstructBinaryTreefromInorderandPostorderTraversalExample;
import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.List;

public class $106Example extends $106ConstructBinaryTreefromInorderandPostorderTraversalExample {

    @Override
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0) {
            return null;
        }
        if (inorder.length == 1) {
            return new TreeNode(postorder[postorder.length - 1]);
        }

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int inOrderRootIndex = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == postorder[postorder.length - 1]) {
                inOrderRootIndex = i;
                break;
            }
        }

        int[] leftInorder = new int[inOrderRootIndex];
        System.arraycopy(inorder, 0, leftInorder, 0, leftInorder.length);
        int[] rightInorder = new int[inorder.length - 1 - inOrderRootIndex];
        System.arraycopy(inorder, inOrderRootIndex + 1, rightInorder, 0, rightInorder.length);

        int[] leftPostorder = new int[leftInorder.length];
        System.arraycopy(postorder, 0, leftPostorder, 0, leftPostorder.length);
        int[] rightPostorder = new int[rightInorder.length];
        System.arraycopy(postorder, leftPostorder.length, rightPostorder, 0, rightPostorder.length);
        root.left = buildTree(leftInorder, leftPostorder);
        root.right = buildTree(rightInorder, rightPostorder);

        return root;
    }

    public static void main(String[] args) {
        $106ConstructBinaryTreefromInorderandPostorderTraversalExample example = new $106Example();
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        TreeNode root = example.buildTree(inorder, postorder);

        $102BinaryTreeLevelOrderTraversalExample levelTraversal = new $102Example();
        List<List<Integer>> result = levelTraversal.levelOrder(root);
        System.out.println(result);
    }
}
