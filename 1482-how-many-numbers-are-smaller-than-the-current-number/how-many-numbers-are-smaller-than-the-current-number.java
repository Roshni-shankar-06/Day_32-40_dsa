class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Count frequencies of each number (Constraint: 0 <= nums[i] <= 100)
        int[] count = new int[102];
     
