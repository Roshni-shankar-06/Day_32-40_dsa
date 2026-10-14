class Solution:
  def findKthNumber(self, n: int, k: int) -> int:
    ans = 1

    i = 1
    while i < k:
      gap = self._getGap(ans, ans + 1, n)
     
    

 
