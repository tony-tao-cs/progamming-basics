public class SubsequenceChecker {
    public boolean isSubsequence(String s, String t) {
        // Space complexity: O(1)
        // Time complexity: O(n), where n is length of t

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Continue looping while both pointers are in range
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Move forward in s only if chars match
            }
            j++; // Always move forward in t
        }

        // If i reached end of s, all chars matched in sequence
        return i == s.length();
    }

    public static void main(String[] args) {
        SubsequenceChecker checker = new SubsequenceChecker();

        System.out.println(checker.isSubsequence("abc", "ahbgdc")); // true
        System.out.println(checker.isSubsequence("axc", "ahbgdc")); // false
        System.out.println(checker.isSubsequence("", "ahbgdc"));    // true
        System.out.println(checker.isSubsequence("abc", ""));       // false
        System.out.println(checker.isSubsequence("ace", "abcde"));  // true
    }
}
