class Solution {
  public int trapRainWater(int[][] heightMap) {
    // h := heightMap[i][j] or the height after filling water
    record T(int i, int j, int h) {}
    final int[][] DIRS = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    final int m = heightMap.length;
    final int n = heightMap[0].length;
    int ans = 0;
    Queue<T> minHeap = new PriorityQueue<>(Comparator.comparingInt(T::h));
    boolean[][] seen = new boolean[m][n];

    for (int i = 0; i < m; ++i) {
      minHeap.offer(new T(i, 0, heightMap[i][0]));
      minHeap.offer(new T(i, n - 1, heightMap[i][n - 1]));
      seen[i][0] = true;
   
