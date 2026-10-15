class Solution:
  def gameOfLife(self, board: list[list[int]]) -> None:
    m = len(board)
    n = len(board[0])

    for i in range(m):
      for j in range(n):
        ones = 0
        for x in range(max(0, i - 1), min(m, i + 2)):
     
