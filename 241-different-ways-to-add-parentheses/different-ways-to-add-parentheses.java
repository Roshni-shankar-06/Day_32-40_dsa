class Solution {
  public List<Integer> diffWaysToCompute(String expression) {
    return ways(expression, new HashMap<>());
  }

  private List<Integer> ways(final String s, Map<String, List<Integer>> mem) {
    if (mem.containsKey(s))
      return mem.get(s);

