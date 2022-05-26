package binary;

public class MissingNumber {
  // a ^ b ^ b = a
  // in each iteration xor is completing if there is no missing number xor == 0
  public int missingNumber(int[] nums) {
    int xor = nums.length;
    for (int i = 0; i < nums.length; i++) {
      xor = xor ^ i;
      xor = xor ^ nums[i];
    }
    return xor;
  }
}
