package q1373;

import tree.TreeNode;

public class Q1373 {
    private int res;
    private static final int INF = 0x3f3f3f;
    class SubTree {
        private boolean isBST;
        private int minValue;
        private int maxValue;

        private int sumValue;

        public SubTree(){}

        public SubTree(boolean isBST, int minValue, int maxValue, int sumValue) {
            this.isBST = isBST;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.sumValue = sumValue;
        }
    }
    public int maxSumBST(TreeNode root) {
        res = 0;
        dfs(root);
        return res;
    }

    private SubTree dfs(TreeNode root) {
        if (root == null) {
            return new SubTree(true, INF, -INF, 0);
        }
        SubTree leftChild = dfs(root.left);
        SubTree rightChild = dfs(root.right);
        if (leftChild.isBST && rightChild.isBST &&
                leftChild.maxValue < root.val &&
                rightChild.minValue > root.val) {
            int sum = leftChild.sumValue + rightChild.sumValue + root.val;
            if (sum > res) {
                res = sum;
            }
            return new SubTree(true,
                    Math.min(leftChild.minValue, root.val),
                    Math.max(rightChild.maxValue, root.val),
                    sum);
        } else {
            return new SubTree(false, 0, 0, 0);
        }
    }
}
