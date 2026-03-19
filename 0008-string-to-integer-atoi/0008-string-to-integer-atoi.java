class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        s = s.trim();
        int n = s.length();
        int i = 0, sign = 1;
        long res = 0;

        // Step 1: Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 2: Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;

            // Step 3: Handle overflow
            if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * res);
    }
}