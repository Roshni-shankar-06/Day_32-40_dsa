public class Solution {
    public String sortString(String s) {
        // Step 1: Count the frequency of each character
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        int totalLength = s.length();
        
        // Step 2: Simulate the process until the resulting string matches the original length
        while (sb.length() < totalLength) {
            // Ascending order pass: pick the smallest available characters ('a' to 'z')
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    sb.append((char) (i + 'a'));
                    count[i]--;
                }
            }
            
            // Descending order pass: pick the largest available characters ('z' to 'a')
            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                   n sb.toString();
    }
}
