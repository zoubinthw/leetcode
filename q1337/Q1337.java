package q1337;

import java.util.ArrayList;
import java.util.List;

public class Q1337 {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        List<Integer>[] adjList = new ArrayList[n + 1];
        for (int i = 0; i <= n ; i++) {
            adjList[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adjList[a].add(b);
            adjList[b].add(a);
        }

        boolean[] isUsed = new boolean[n + 1];
        return dfs(adjList, isUsed, 1, t, target);
    }

    private double dfs(List<Integer>[] adjList, boolean[] isUsed, int node, int remainderTime, int target) {
        int numSubNode = node == 1 ? adjList[node].size() : adjList[node].size() - 1;
        if (remainderTime == 0 || numSubNode == 0) {
            return node == target ? 1.0 : 0.0;
        }
        isUsed[node] = true;
        double ans = 0.0;
        for (Integer subNode : adjList[node]) {
            if (!isUsed[subNode]) {
                ans += dfs(adjList, isUsed, subNode, remainderTime-1, target);
            }
        }

        return ans / numSubNode;
    }
}
