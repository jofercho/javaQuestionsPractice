package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  //  public boolean containsDuplicate(int[] nums){
  //    Set<Integer> uniqueValues = new HashSet<>();
  //    for (int num :nums) {
  //      if(uniqueValues.contains(num)){
  //        return true;
  //      }
  //      uniqueValues.add(num);
  //    }
  //    return false;
  //  }
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> values = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (values.contains(nums[i])) {
        return true;
      }
      values.add(nums[i]);
    }
    return false;
  }
}
