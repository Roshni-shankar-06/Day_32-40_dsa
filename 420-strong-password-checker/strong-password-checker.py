class Solution:
  def strongPasswordChecker(self, password: str) -> int:
    n = len(password)
    missing = self._getMissing(password)
    # the number of replacements to deal with 3 repeating characters
    replaces = 0
  
