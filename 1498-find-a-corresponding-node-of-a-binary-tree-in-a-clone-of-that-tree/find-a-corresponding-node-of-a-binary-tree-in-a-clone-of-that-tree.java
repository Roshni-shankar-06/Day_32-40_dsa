class Solution {
  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
                                      final TreeNode target) {
    dfs(original, cloned, target);
    return ans;
  }

  private TreeNode ans = null;
