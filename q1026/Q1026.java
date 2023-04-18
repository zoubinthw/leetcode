package q1026;

import tree.TreeNode;

public class Q1026 {
    private int result = 0;
    public int maxAncestorDiff(TreeNode root) {
        getMaxDiff(root, root.val, root.val);
        return result;
    }

    private void getMaxDiff(TreeNode root, int maxValue, int minValue) {
        if (root == null) return;
        result = Math.max(Math.max(Math.abs(root.val-maxValue), Math.abs(root.val-minValue)),  result);
        maxValue = Math.max(maxValue, root.val);
        minValue = Math.min(minValue, root.val);
        getMaxDiff(root.left, maxValue, minValue);
        getMaxDiff(root.right, maxValue, minValue);
    }
}
