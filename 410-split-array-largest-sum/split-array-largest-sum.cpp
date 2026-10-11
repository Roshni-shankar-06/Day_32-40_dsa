class Solution {
 public:
  int splitArray(vector<int>& nums, int k) {
    const int n = nums.size();
    vector<vector<int>> mem(n + 1, vector<int>(k + 1, INT_MAX));
   
