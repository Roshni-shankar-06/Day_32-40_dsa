class Solution {
  public List<Integer> diffWaysToCompute(String expression) {
    return ways(expression, new HashMap<>());
  }

