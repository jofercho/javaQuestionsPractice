package array;

public class ProductExceptSelf {
//  public int[] productExceptSelf(int[] nums){
//    int[] solution = new int[nums.length];
//    solution[0] = 1;
//    int product = 1;
//    for (int i = 1; i < nums.length; i++) {
//      solution[i] = nums[i-1] * solution[i-1];
//    }
//
//    for(int i = nums.length - 1; i>=0; i--){
//      solution[i] = solution[i] * product;
//      product = product * nums[i];
//    }
//    return solution;
//  }

  public int[] productExceptSelf(int[] nums){
    int[] products = new int[nums.length];
    int product = 1;
    products[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      products[i] = products[i-1] * nums[i-1];
    }
    for (int i = nums.length - 1; i > 0; i--) {
      products[i - 1] = nums[i] * products[i-1] * product;
      product *= nums[i];
    }
    return products;
  }
}
