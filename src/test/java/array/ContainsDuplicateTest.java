package array;

import array.ContainsDuplicate;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsDuplicateTest {

  @Test
  public void containsDuplicateTest(){
    int [] input1 = {1,2,3,1};
    int [] input2 = {1,2,3,4};
    int [] input3 = {1,1,1,3,3,4,3,2,4,2};
    boolean output1 = true;
    boolean output2 = false;
    boolean output3 = true;
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    boolean solution1 = containsDuplicate.containsDuplicate(input1);
    boolean solution2 = containsDuplicate.containsDuplicate(input2);
    boolean solution3 = containsDuplicate.containsDuplicate(input3);
    assertThat(output1).isEqualTo(solution1);
    assertThat(output2).isEqualTo(solution2);
    assertThat(output3).isEqualTo(solution3);
  }
}
