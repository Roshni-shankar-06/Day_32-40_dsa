class Solution:
  def findKthNumber(self, n: int, k: int) -> int:
    ans = 1

    i = 1
    while i < k:
      gap = self._getGap(ans, ans + 1, n)
      if i + gap <= k:
        i += gap
        ans += 1
      else:
        i += 1
        ans *= 10

    return ans

  def _getGap(self, a: int, b: int, n: int) -> int:
