class Solution:
  def daysBetweenDates(self, date1: str, date2: str) -> int:
    days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    def isLeapYear(year: int) -> bool:
    
