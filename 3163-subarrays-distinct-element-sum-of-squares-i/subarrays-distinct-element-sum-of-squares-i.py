class Solution:
    def sumCounts(self, nums: List[int]) -> int:
        res = 0
        n = len(nums)
        for i in range(n):
            seen = set()
          
