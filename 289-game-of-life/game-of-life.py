class Solution:
  def gameOfLife(self, board: list[list[int]]) -> None:
    m = len(board)
    n = len(board[0])

    for i in range(m):
      for j in range(n):
        ones = 0
        for x in range(max(0, i - 1), min(m, i + 2)):
          for y in range(max(0, j - 1), min(n, j + 2)):
            ones += board[x][y] & 1
        # Any live cell with two or three live neighbors lives on to the next
        # generation.
        if board[i][j] == 1 and (ones == 3 or ones == 4):
       
