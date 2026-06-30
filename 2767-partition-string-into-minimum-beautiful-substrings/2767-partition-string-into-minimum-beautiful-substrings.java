class Solution {
    public int minimumBeautifulSubstrings(String s) {
        int minString = function(0, s);
        if (minString > s.length()) {
            return -1;
        }

        return minString;
    }

    public int function(int index, String s) {
        if (index == s.length()) {
            return 0;
        }

        if(s.charAt(index) == '0') {
            return 20; // Should be greater than 15
        }

        int ans = 20;
        int num = 0;

        for (int i = index;i < s.length();i++) {
            String sub = s.substring(index, i + 1);
            num = Integer.parseInt(sub, 2);

            if (check(num, 5)) {
                ans = Math.min(ans, 1 + function(i+1, s));
            }
        }

        return ans;
    }

    public static boolean check(int num, int base) {
        if (num == 0) {
            return false;
        }

        while (num % base == 0) {
            num = num / base;
        }

        if (num == 1) {
            return true;
        }
        
        return false;
    }
}