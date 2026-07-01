class Solution {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen > hLen) {
            return -1;
        }

        if (nLen == hLen && !haystack.equals(needle)) {
            return -1;
        }

        if (nLen == hLen && haystack.equals(needle)) {
            return 0;
        }

        for (int i=0;i<hLen-nLen+1;i++) {
            if (haystack.substring(i, i+nLen).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}