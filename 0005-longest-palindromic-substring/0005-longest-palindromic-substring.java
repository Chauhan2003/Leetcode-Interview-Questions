class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String result = "";

        for (int i = 0; i < n; i++) {
            // Odd length
            String odd = expand(s, i, i);

            // Even length
            String even = expand(s, i, i + 1);

            if (odd.length() > result.length()) {
                result = odd;
            }

            if (even.length() > result.length()) {
                result = even;
            }
        }

        return result;
    }

    private String expand(String s, int left, int right) {
        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }
}