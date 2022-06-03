package dynamicProgramming;

public class LongestIncreasingSubsequence {
  public int lengthOfLIS(int[] nums) {
    int[] LIS = new int[nums.length];
    LIS[nums.length - 1] = 1;
    int max = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          LIS[i] = Math.max(LIS[i], Math.max(1, 1 + LIS[j]));
        } else {
          LIS[i] = Math.max(1, LIS[i]);
        }
      }
      if (LIS[i] > max) {
        max = LIS[i];
      }
    }
    return max;
  }
}
