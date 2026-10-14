class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Number of papers that have at least citations[mid] citations
            int paperCount = n - mid;
            
            if (citations[mid] == paperCount) {
                return paperCount;
            
