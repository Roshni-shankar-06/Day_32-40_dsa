class Solution:
  def daysBetweenDates(self, date1: str, date2: str) -> int:
    days = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

    def isLeapYear(year: int) -> bool:
      return year % 4 == 0 and year % 100 != 0 or year % 400 == 0

    def daysFrom1971(date: str) -> int:
     
