package dynamicProgramming;

public class ClimbingStairs {
  public int climbStairs(int n) {
    if (n == 1) return 1;
    int one = 1, two = 1;
    for (int i = 1; i < n; i++) {
      int tmp = one;
      one += two;
      two = tmp;
    }
    return one;
  }
}
