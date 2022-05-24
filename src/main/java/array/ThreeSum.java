package array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> solution = new LinkedList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || nums[i] != nums[i - 1]) {
        // since here we make a two sum
        int max = nums.length - 1;
        int min = i + 1;
        int complement = 0 - nums[i];
        while (min < max) {
          if (complement == nums[max] + nums[min]) {
            solution.add(Arrays.asList(nums[i], nums[min], nums[max]));
            while (max > min && nums[min] == nums[min + 1]) min++;
            while (max > min && nums[max] == nums[max - 1]) max--;
            max--;
            min++;
          } else if (complement < nums[min] + nums[max]) {
            min++;
          } else {
            max--;
          }
        }
      }
    }
    return solution;
  }
}
