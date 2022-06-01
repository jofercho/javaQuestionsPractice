package binary;

import org.junit.Assert;
import org.junit.Test;

public class ReverseBitsTest {

  @Test
  public void reverseBitsTest() {
    String input1String = "11111111111111111111111111111101";
    String input2String = "00000010100101000001111010011100";
    String output1String = "10111111111111111111111111111111";
    String output2String = "00111001011110000010100101000000";
    int output1 = Integer.parseUnsignedInt(output1String, 2);
    int output2 = Integer.parseUnsignedInt(output2String, 2);
    ReverseBits bits = new ReverseBits();
    Assert.assertEquals(output1, bits.reverseBits(Integer.parseUnsignedInt(input1String, 2)));
    Assert.assertEquals(output2, bits.reverseBits(Integer.parseUnsignedInt(input2String, 2)));
  }
}
