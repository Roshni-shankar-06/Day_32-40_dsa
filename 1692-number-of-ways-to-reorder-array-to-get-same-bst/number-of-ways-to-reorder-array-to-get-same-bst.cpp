class Solution {
public:
    int numOfWays(vector<int>& nums) {
        comb = generate(nums.size() + 1);
        return (ways(nums) - 1 + kMod) % kMod;
    }

private:
    static constexpr int kMod = 1'000'000'007;
    vector<vector<long long>> comb;

    // Precompute combination table C(n, k) using Pascal's triangle
    vector<vector<long long>> generate(int n) {
        vector<vector<long long>> c(n, vector<long long>(n, 1));
        for (int i = 2; i < n; ++i) {
            for (int j = 1; j < i; ++j) {
                c[i][j] = (c[i - 1][j - 1] + c[i - 1][j]) % kMod;
            }
        }
        return c;
    }

    long long ways(const vector<int>& nums) {
        if (nums.size() <= 2) return 1;

        vector<int> left;
        vector<int> right;
        for (size_t i = 1; i < nums.size(); ++i) {
            if (nums[i] < nums[0]) {
                left.push_back(nums[i]);
            } else {
                right.push_back(nums[i]);
            }
        }

        long long ans = comb[nums.size() - 1][left.size()];
        
