class Solution {
  public int maxSum(List<Integer> nums, int k) {
    final int MOD = 1_000_000_007;
    final int MAX_BIT = 30;
    int ans = 0;
    // minIndices[i] := the minimum index in `optimalNums` that the i-th bit
    // should be moved to
  
