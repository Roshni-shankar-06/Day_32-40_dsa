class Solution {
  public int[] kWeakestRows(int[][] mat, int k) {
    int[] ans = new int[k];
    Pair<Integer, Integer>[] rowSums = new Pair[mat.length];

 .thenComparingInt(Pair<Integer, Integer>::getValue));

   
