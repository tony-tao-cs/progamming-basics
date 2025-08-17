public class ContinueDemo {

    public static void main(String[] args) {
        System.out.println("=== Using continue ===");
        withContinue();

        System.out.println("\n=== Without using continue ===");
        withoutContinue();
    }

    static void withContinue() {
        String[] names = {"Alice", "", null, "Bo", "Charlie", "  ", "Eve"};

        for (String name : names) {
            if (name == null || name.trim().isEmpty() || name.length() < 3) {
                continue; // Skip invalid names
            }
            System.out.println("Valid name: " + name);
        }
    }

    static void withoutContinue() {
        String[] names = {"Alice", "", null, "Bo", "Charlie", "  ", "Eve"};

        for (String name : names) {
            if (name != null && !name.trim().isEmpty() && name.length() >= 3) {
                System.out.println("Valid username: " + name);
            }
        }
    }
}
