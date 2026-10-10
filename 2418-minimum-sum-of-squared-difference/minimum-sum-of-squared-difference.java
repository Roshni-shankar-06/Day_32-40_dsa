class Solution {
  public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
    int[] diff = getDiff(nums1, nums2);
    int k = k1 + k2;
    if (Arrays.stream(diff).asLongStream().sum() <= k)
      return 0;

