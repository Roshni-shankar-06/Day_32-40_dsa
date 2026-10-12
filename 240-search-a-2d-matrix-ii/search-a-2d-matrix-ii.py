class Solution:
  def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
    r = 0
    c = len(matrix[0]) - 1
