class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Step 1: Count frequencies of each number (Constraint: 0 <= nums[i] <= 100)
        int[] count = new int[102];
        for (int num : nums) {
            count[num]++;
        }
        
        // Step 2: Compute running sum of frequencies
        // Each index i will now store how many numbers are <= i
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // Step 3: Populate the results array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0; // No numbers are smaller than 0
            } else {
                // The number of elements strictly smaller than nums[i] 
                // is stored in count[nums[i] - 1]
                result[i] = count[nums[i] - 1];
            }
        }
        
        return result;
    }
}
 
