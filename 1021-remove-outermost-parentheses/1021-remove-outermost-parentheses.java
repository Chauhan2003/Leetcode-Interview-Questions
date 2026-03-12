class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();

        int counter = 0;
        StringBuilder result = new StringBuilder();

        for (int i=0;i<n;i++) {
            if (s.charAt(i) == '(') {
                if (counter > 0) {
                    result.append(s.charAt(i));
                }

                counter++;
            }

            if (s.charAt(i) == ')') {
                counter--;
                
                if (counter > 0) {
                    result.append(s.charAt(i));
                }
            }
        }

        return result.toString();
    }
}