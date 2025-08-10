public class IfElse {
  private static final boolean CONDITION1 = true;
  private static final boolean CONDITION2 = false;

  public static void ifAndIf() {
    if (CONDITION1) {
      System.out.println("One");
    } 
    if (CONDITION2) {
      System.out.println("Two");
    }
  }

  public static void ifElseIf() {
    if (CONDITION1) {
      System.out.println("One");
    } 
    else if (CONDITION2) {
      System.out.println("Two");
    }
  }

  public static void ifElse() {
    if (CONDITION1) {
      if (CONDITION2) {
        System.out.println("One");
      }
    } 
    else {
      System.out.println("Two");
    }
  }

  public static void ifElse2() {
    if (CONDITION1 && CONDITION2) {
      System.out.println("One");
    } 
    else {
      System.out.println("Two");
    }
  }

  public static void main(String[] args) {
    // ifAndIf();
    // ifElseIf();
    // ifElse();
     ifElse2();
  }
}