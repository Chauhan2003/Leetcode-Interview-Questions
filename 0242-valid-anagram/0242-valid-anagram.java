class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();

        if (s_len != t_len) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i=0;i<s_len;i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int j=0;j<t_len;j++) {
            if (map.containsKey(t.charAt(j)) && map.get(t.charAt(j)) > 0) {
                map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}