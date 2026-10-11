class Solution {
 public:
  int splitArray(vector<int>& nums, int k) {
    const int n = nums.size();
    vector<vector<int>> mem(n + 1, vector<int>(k + 1, INT_MAX));
    vector<int> prefix(n + 1);
    partial_sum(nums.begin(), nums.end(), prefix.begin() + 1);
    return splitArray(nums, n, k, prefix, mem);
  }

