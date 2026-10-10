class Solution {
 public:
  bool canCross(vector<int>& stones) {
    const int n = stones.size();
    // dp[i][j] := true if a frog can make a size j jump to stones[i]
    vector<vector<bool>> dp(n, vector<bool>(n + 1));
    dp[0][0] = true;

 
