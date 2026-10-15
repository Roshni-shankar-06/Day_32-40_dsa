class Solution:
    def findDuplicate(self, nums: list[int]) -> int:
        # Phase 1: Find the intersection point of the tortoise and hare
        slow = nums[0]
        fast = nums[0]
        
        while True:
            slow = nums[slow]          # Moves 1 step
            fast = nums[nums[fast]]    # Moves 2 steps
            if slow == fast:
                break
        
     
