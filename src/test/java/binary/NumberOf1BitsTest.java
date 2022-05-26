package binary;

import org.junit.Assert;
import org.junit.Test;

public class NumberOf1BitsTest {
  @Test
  public void numberOf1BitsTest() {
    String bits1Representation1 = "00000000000000000000000000001011";
    String bits1Representation2 = "00000000000000000000000010000000";
    String bits1Representation3 = "11111111111111111111111111111101";
    int output1 = 3;
    int output2 = 1;
    int output3 = 31;
    NumberOf1Bits bits = new NumberOf1Bits();
    Assert.assertEquals(
        output1, bits.hammingWeight(Integer.parseUnsignedInt(bits1Representation1, 2)));
    Assert.assertEquals(
        output2, bits.hammingWeight(Integer.parseUnsignedInt(bits1Representation2, 2)));
    Assert.assertEquals(
        output3, bits.hammingWeight(Integer.parseUnsignedInt(bits1Representation3, 2)));
  }
}
