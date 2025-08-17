public class PalindromeChecker {

    // Using while loop
    public static boolean isPalindromeWhile(String input) {
        if (input == null) {
            return false;
        }

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Using for loop
    public static boolean isPalindromeFor(String input) {
        if (input == null) {
            return false;
        }

        int length = input.length();
        for (int left = 0, right = length - 1; left < right; left++, right--) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testCases = {"racecar", "level", "hello", "madam", "12321", "java"};

        System.out.println("Using while loop:");
        for (String test : testCases) {
            System.out.println(test + " -> " + isPalindromeWhile(test));
        }

        System.out.println("\nUsing for loop:");
        for (String test : testCases) {
            System.out.println(test + " -> " + isPalindromeFor(test));
        }
    }
}