class Solution:
  def strongPasswordChecker(self, password: str) -> int:
    n = len(password)
    missing = self._getMissing(password)
    # the number of replacements to deal with 3 repeating characters
    replaces = 0
    # the number of sequences that can be substituted with 1 deletions,
    # (3k)-seqs
    oneSeq = 0
    # the number of sequences that can be substituted with 2 deletions,
    # (3k + 1)-seqs
    twoSeq = 0

    i = 2
    while i < n:
     
