class Solution:
  def maxProfit(self, prices: list[int]) -> int:
    sell = 0
    hold = -math.inf
    prev = 0

    for price in prices:
   
