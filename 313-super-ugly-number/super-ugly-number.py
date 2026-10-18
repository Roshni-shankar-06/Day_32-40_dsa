class Solution:
  def nthSuperUglyNumber(self, n: int, primes: list[int]) -> int:
    k = len(primes)
    nums = [1]
    indices = [0] * k

    while len(nums) < n:
      nexts = [0] * k
    
