class Solution {
  public List<Integer> diffWaysToCompute(String expression) {
    return ways(expression, new HashMap<>());
  }

  private List<Integer> ways(final String s, Map<String, List<Integer>> mem) {
    if (mem.containsKey(s))
      return mem.get(s);

    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < s.length(); ++i)
      if (!Character.isDigit(s.charAt(i)))
      
