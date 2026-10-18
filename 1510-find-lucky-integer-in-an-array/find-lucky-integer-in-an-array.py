class Solution:
  def findLucky(self, arr: list[int]) -> int:
    count = [0] * (len(arr) + 1)

    for a in arr:
      if a <= len(arr):
        count[a] += 1
