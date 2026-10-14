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
            } else if (citations[mid] < paperCount) {
                // Not enough citations, look for a larger value to the right
                left = mid + 1;
            } else {
                // Too many citations or valid candidate, look for a potential larger h-index to the left
                right = mid - 1;
            }
        }
        
        // When left > right, 'n - left' represents the maximum valid h-index found
        return n - left;
    }
}

