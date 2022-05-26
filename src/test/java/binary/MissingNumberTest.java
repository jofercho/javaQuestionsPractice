package binary;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {
  @Test
  public void missingNumberTest(){
    int[] input1 = new int[]{3,0,1};
    int[] input2 = new int[]{0,1};
    int[] input3 = new int[]{9,6,4,2,3,5,7,0,1};
    int output1 = 2;
    int output2 = 2;
    int output3 = 8;
    MissingNumber number = new MissingNumber();
    Assert.assertEquals(number.missingNumber(input1),output1);
    Assert.assertEquals(number.missingNumber(input2),output2);
    Assert.assertEquals(number.missingNumber(input3),output3);
  }
}
