// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

class solution {
    public static boolean isSubSequence(String s, String t) {
        int i, j, len1, len2;
        i = j = 0;
        len1 = s.length();
        len2 = t.length();

        while (i < len1) {
            if (j >= len2) {
                return false;
            } else if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String s= "abc";
        String t = "abcdef";
        boolean ans = isSubSequence(s,t);
        System.out.println(ans);
    }
}