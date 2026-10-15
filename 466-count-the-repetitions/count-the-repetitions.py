class Solution:

  def getMaxRepetitions(self, s1: str, n1: int, s2: str, n2: int) -> int:
    n = len(s2)
    d = {}
    for i in range(n):
    
