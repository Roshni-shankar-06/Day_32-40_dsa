class Solution {
 public:
  vector<int> productExceptSelf(vector<int>& nums) {
    const int n = nums.size();
    vector<int> ans(n);        // Can also use `nums` as the ans array.
    vector<int> prefix(n, 1);  // prefix product
   
