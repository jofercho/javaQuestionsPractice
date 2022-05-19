import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> solution = new LinkedList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        int max = nums.length - 1; //
        int min = i + 1;
        int sum = 0 - nums[i]; // 0 because is the target
        while (min < max) {
          if (sum == nums[min] + nums[max]) {
            solution.add(Arrays.asList(nums[i], nums[min], nums[max]));
            while (min<max && nums[min] == nums[min] + 1) min++;
            while (min<max && nums[max] == nums[max] - 1) max--;
            max--;
            min++;
          }else if(nums[min] + nums[max] > sum){
            max--;
          } else {
            min++;
          }
        }
      }
    }
    return solution;
  }
}
