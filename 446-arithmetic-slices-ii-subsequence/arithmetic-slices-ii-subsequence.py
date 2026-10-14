class Solution:
  def numberOfArithmeticSlices(self, nums: list[int]) -> int:
    n = len(nums)
    ans = 0
    # dp[i][j] := the number of subsequences end in nums[j] nums[i]
 
