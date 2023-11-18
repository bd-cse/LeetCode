class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("\\s", "").replaceAll("  [^A-Za-z0-9]", "");
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}