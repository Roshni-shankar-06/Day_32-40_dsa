class Solution {
  public int trapRainWater(int[][] heightMap) {
    // h := heightMap[i][j] or the height after filling water
    record T(int i, int j, int h) {}
  
