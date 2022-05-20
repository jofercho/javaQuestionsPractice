package array;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
  int[] twoSum(int[] nums, int target) {
    int complement;
    Map<Integer, Integer> values = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      complement = target - nums[i];
      if (values.containsKey(complement)) {
        return new int[] {values.get(complement), i};
      }
      values.put(nums[i], i);
    }
    return null;
  }
}
