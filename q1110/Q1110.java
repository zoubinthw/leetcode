package q1110;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q1110 {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : to_delete) {
            set.add(i);
        }

        TreeNode end = postTravel(root, set, res);
        if (end != null) {
            res.add(end);
        }

        return res;
    }

    private TreeNode postTravel(TreeNode root, Set<Integer> set, List<TreeNode> resList) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            if (set.contains(root.val)) {
                return null;
            } else {
                return root;
            }
        }
        root.left = postTravel(root.left, set, resList);
        root.right = postTravel(root.right, set, resList);
        if (set.contains(root.val)) {
            if (root.left != null) {
                resList.add(root.left);
            }
            if (root.right != null) {
                resList.add(root.right);
            }

            return null;
        } else {
            return root;
        }
    }
}
