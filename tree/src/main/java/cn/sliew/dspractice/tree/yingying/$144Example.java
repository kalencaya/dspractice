package cn.sliew.dspractice.tree.yingying;

//给定一个二叉树，返回它的 前序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,2,3]
//
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树
// 👍 368 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import cn.sliew.dspractice.tree.problem.TreeNode;

import java.util.ArrayList;
import java.util.List;


// Definition for a binary tree node.
//public class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

class $144Example {
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> results = new ArrayList<Integer>();
        recursive(root, results);
        return results;
    }

    public void recursive(TreeNode root, List<Integer> results) {
        results.add(root.val);
        if (root.left != null) {
            recursive(root.left, results);
        }
        if (root.right != null) {
            recursive(root.right, results);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

