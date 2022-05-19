import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaximunProductSubArray {
  //    public int maxProduct(int[] nums) {
  //        int solution = nums[0];
  //        int max = nums[0];
  //        int min = nums[0];
  //        for (int i = 1; i < nums.length; i++) {
  //            int maxNotUpdated = max;
  //            max = Math.max(Math.max(maxNotUpdated  * nums[i], min * nums[i]), nums[i]);
  //            min = Math.min(Math.min(maxNotUpdated  * nums[i], min * nums[i]), nums[i]);
  //            solution = Math.max(max, solution);
  //        }
  //        return solution;
  //    }

  public int maxProduct(int[] nums) {
    int solution = nums[0];
    int max = nums[0];
    int min = nums[0];
    for (int i = 1; i < nums.length; i++) {
      int tmp = max;
      max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
      min = Math.min(Math.min(tmp * nums[i], min * nums[i]), nums[i]);
      solution = Math.max(solution, max);
    }
    return solution;

  }
}
