public class Solution {
    public String sortString(String s) {
        // Step 1: Count the frequency of each character
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        int totalLength = s.length();
        
