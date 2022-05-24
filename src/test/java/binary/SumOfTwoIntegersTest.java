package binary;

import org.junit.Assert;
import org.junit.Test;

public class SumOfTwoIntegersTest {

  @Test
  public void sumOfTwoIntegersTest() {
    int a1 = 1;
    int b1 = 2;
    int a2 = 2;
    int b2 = 3;
    SumOfTwoIntegers sum = new SumOfTwoIntegers();
    Assert.assertEquals(a1 + b1, sum.getSum(a1, b1));
    Assert.assertEquals(a2 + b2, sum.getSum(a2, b2));
  }
}
