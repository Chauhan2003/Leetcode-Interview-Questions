class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        
        int arrLen = strs.length;
        int strLen = strs[0].length();

        StringBuilder result = new StringBuilder();

        for (int i=0;i<strLen;i++){
            if (strs[0].charAt(i) != strs[arrLen-1].charAt(i)) {
                return result.toString();
            }

            result.append(strs[0].charAt(i));
        }

        return result.toString();
    }
}