class Solution {
public:
    int numOfWays(vector<int>& nums) {
        comb = generate(nums.size() + 1);
        return (ways(nums) - 1 + kMod) % kMod;
    }

private:
    static constexpr int kMod = 1'000'000'007;
    vector<vector<long long>> comb;
