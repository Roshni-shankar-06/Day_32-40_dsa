class Solution:
    def findDuplicate(self, nums: list[int]) -> int:
        # Phase 1: Find the intersection point of the tortoise and hare
        slow = nums[0]
     
