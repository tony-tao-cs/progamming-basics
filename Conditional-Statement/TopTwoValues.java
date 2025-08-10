public class TopTwoValues {

  public static int[] findMaxTwo(int[] nums) {
    if (nums == null || nums.length < 2) {
      throw new IllegalArgumentException("Array must contain at least two elements");
    }

    // Initialize the two largest values to the smallest possible integer
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    // Iterate through the array
    for (int num : nums) {
      if (num > first) {
        // Update second to be the old first
        second = first;
        // Update first to be num
        first = num;
      } else if (num > second) {
        // Update second only
        second = num;
      }
    }

    return new int[] {first, second};
  }

  public static void main(String[] args) {
    int[] vals = {5, 1, 2, 5};
    // Call the findMaxTwo method and store the result
    try {
      int[] maxTwo = findMaxTwo(vals);
      // Print the two largest values
      System.out.println("The two largest values are: " + maxTwo[0] + ", " + maxTwo[1]);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}