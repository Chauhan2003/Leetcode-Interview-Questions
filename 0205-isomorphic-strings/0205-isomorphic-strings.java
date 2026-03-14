class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char s_ch = s.charAt(i);
            char t_ch = t.charAt(i);

            if (mapST.containsKey(s_ch) && mapST.get(s_ch) != t_ch) {
                return false;
            }

            if (mapTS.containsKey(t_ch) && mapTS.get(t_ch) != s_ch) {
                return false;
            }

            mapST.put(s_ch, t_ch);
            mapTS.put(t_ch, s_ch);
        }

        return true;
    }
}