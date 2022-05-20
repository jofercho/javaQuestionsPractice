package array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
  public boolean containsDuplicate(int[] nums){
    Set<Integer> uniqueValues = new HashSet<>();
    for (int num :nums) {
      if(uniqueValues.contains(num)){
        return true;
      }
      uniqueValues.add(num);
    }
    return false;
  }
}
