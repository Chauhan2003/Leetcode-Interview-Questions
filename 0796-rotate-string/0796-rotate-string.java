class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        // Concatenate: s + s
        String doubled = s + s;

        // abcde + abcde
        // abcdeabcde - contains - cdeab
        if (doubled.contains(goal)) {
            return true;
        }

        return false;

    }
}