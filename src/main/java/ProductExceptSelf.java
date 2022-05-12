public class ProductExceptSelf {
  public int[] productExceptSelf(int[] nums){
    int [] solution = new int[nums.length];
    int product = 1;
    solution[0] = 1;
    for (int i = 1; i < nums.length; i++) {
//      product = product * nums[i-1];
      solution[i] = nums[i-1] * solution[i-1];
    }
    for (int i = nums.length - 1; i >= 0 ; i--) {
      solution[i] = product * solution[i];
      product = product * nums[i];
    }
    return solution;
  }
}
