class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        String res = "";

        for (int i = 0; i < n; i++) {
            int f = i;
            int e = i;

            while (f >= 0 && e < n && s.charAt(f) == s.charAt(e)) {
                if ((e - f + 1) > max) {  
                    max = e - f + 1;
                    res = s.substring(f, e + 1);
                }
                f--;  
                e++;
            }

            f = i;
            e = i + 1;

            while (f >= 0 && e < n && s.charAt(f) == s.charAt(e)) {
                if ((e - f + 1) > max) {
                    max = e - f + 1;
                    res = s.substring(f, e + 1);
                }
                f--;
                e++;
            }
        }

        return res;
    }
}