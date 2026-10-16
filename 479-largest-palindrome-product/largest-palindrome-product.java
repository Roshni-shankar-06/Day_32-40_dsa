class Solution {
  public int largestPalindrome(int n) {
    if (n == 1)
      return 9;

    final int MOD = 1337;
    final int upper = (int) Math.pow(10, n) - 1;
    final int lower = (int) Math.pow(10, n - 1) - 1;

