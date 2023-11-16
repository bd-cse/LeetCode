class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alpha = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alpha['z' - s.charAt(i)]++;
            alpha['z' - t.charAt(i)]--;
        }

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0) {
                return false;
            }
        }

        return true;
    }
}