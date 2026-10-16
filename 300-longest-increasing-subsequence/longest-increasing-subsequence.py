class Solution:
  def lengthOfLIS(self, nums: list[int]) -> int:
    # tails[i] := the minimum tails of all the increasing subsequences having
    # length i + 1
    tails = []

    for num in nums:
    
