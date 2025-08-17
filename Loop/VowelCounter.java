public class VowelCounter {

    // Recommended: Using for loop
    public static int countVowelsWithFor(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    // More error-prone: Using while loop
    public static int countVowelsWithWhile(String input) {
        int count = 0;
        int i = 0;
        while (i < input.length()) {
            char ch = input.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
            // Easy to forget:
            i++; // If this is missing, you'll get an infinite loop!
        }
        return count;
    }

    public static void main(String[] args) {
        String test = "Hello World!";

        int countFor = countVowelsWithFor(test);
        int countWhile = countVowelsWithWhile(test);

        System.out.println("Vowel count with for loop: " + countFor);
        System.out.println("Vowel count with while loop: " + countWhile);
    }
}
