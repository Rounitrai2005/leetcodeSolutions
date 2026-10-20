class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }

        int k = needle.length();

        for (int i = 0; i <= haystack.length() - k; i++) {
            int a = 0;
            int b = k - 1;
            int c = i;
            int d = i + k - 1;

            while (c <= d) {
                if (needle.charAt(a) == haystack.charAt(c)) {
                    a++;
                    c++;
                } else {
                    break;
                }
            }

            if (c > d) {
                return i;
            }
        }

        return -1;
    }
}