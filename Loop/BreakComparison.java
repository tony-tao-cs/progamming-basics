public class BreakComparison {
    public static void main(String[] args) {
        System.out.println("=== With break ===");
        withBreak();

        System.out.println("\n=== Without break ===");
        withoutBreak();
    }

    static void withBreak() {
        String[] names = {"", null, "Al", "Bob", "Charlie", "Dan"};

        for (String name : names) {
            if (name == null || name.trim().isEmpty() || name.length() < 3) {
                continue;
            }

            System.out.println("First valid name: " + name);
            break;
        }
    }

    static void withoutBreak() {
        String[] names = {"", null, "Al", "Bob", "Charlie", "Dan"};
        String first = null;

        for (String name : names) {
            if (name != null && !name.trim().isEmpty() && name.length() >= 3) {
                if (first == null) {
                    first = name;
                }
            }
        }

        if (first != null) {
            System.out.println("First valid name: " + first);
        }
    }
}
