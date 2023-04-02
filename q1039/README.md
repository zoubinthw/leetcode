<h2><a href="https://leetcode.cn/problems/minimum-score-triangulation-of-polygon/">1039. 多边形三角剖分的最低得分</a></h2>
<h3>难度:中等</h3>
<h4>1.递归</h4>
<p>递归: 定义dfs(i, j)表示从顶点i到顶点j的顶点顺时针围成的多边形剖解的三角形的最低得分</p>
<p>则dfs(i, i+1)=0，两个顶点无法组成三角形</p>
<p>入口dfs(0, n-1)</p>
<h4>2.动态规划</h4>
<p>递归: 定义dfs(i, j)表示从顶点i到顶点j的顶点顺时针围成的多边形剖解的三角形的最低得分</p>
<p>则dfs(i, i+1)=0，两个顶点无法组成三角形</p>
<p>入口dfs(0, n-1)</p>

时间复杂度均为: O(n^3)
空间复杂度均为: O(n^2)
