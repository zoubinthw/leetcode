<h2>难度middle</h2>
<h3>动态规划</h3>
<h4>明确一点: 子字符串(连续)和子序列(可以不连续)的区别</h4>
<p>两个字符串的最大公共子字符串问题是二维动态规划问题, 定义dp[i][j]为text1[0:i]和text2[0:j]的最大公共子字符串长度，
其中text1[0:i]表示字符串text1中长度为i的子串, text2[0:j]同理，当i=0时，dp[0][j]=0, j=0时,dp[i][0]=0, 因为
长度为0的字符串和任何字符串的公共子串都不存在。</p>
<p>当遍历到text1[i-1]和text2[j-1]的字符时，考虑两种情况表示动态转移方程</p>
<p>1. text1[i-1] == text2[j-1], 此时dp[i][j] = dp[i-1][j-1]+1</p>
<p>2. text1[i-1] != text2[j-1], 此时dp[i][j] = max(dp[i-1][j], dp[i][j-1])</p>
<p>时间复杂度: O(mxn)</p>
<p>空间复杂度: O((m+1)x(n+1))</p>
<p>最终结果</p>
<img width="500px" height="350px" src="img/max_common_str.png">
