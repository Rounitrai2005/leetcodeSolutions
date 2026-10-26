
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[128];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                return i;
            }
        }

        return -1;
    }
}
