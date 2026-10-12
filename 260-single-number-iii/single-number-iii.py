class Solution:
  def singleNumber(self, nums: list[int]) -> list[int]:
    xors = functools.reduce(operator.xor, nums)
