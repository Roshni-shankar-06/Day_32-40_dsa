class NumMatrix:
  def __init__(self, matrix: list[list[int]]):
    if not matrix:
      return

    m = len(matrix)
    n = len(matrix[0])
    # prefix[i][j] := the sum of matrix[0..i)[0..j)
    self.prefix = [[0] * (n + 1) for _ in range(m + 1)]

    for i in range(m):
      for j in range(n):
        self.prefix[i + 1][j + 1] = (matrix[i][j] + self.prefix[i][j + 1] +
                                     self.prefix[i + 1][j] - self.prefix[i][j])

