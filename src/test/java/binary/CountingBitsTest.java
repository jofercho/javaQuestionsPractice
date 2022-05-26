package binary;

import org.junit.Assert;
import org.junit.Test;

public class CountingBitsTest {

  @Test
  public void countingBitsTest() {
    int input1 = 2;
    int input2 = 5;

    int[] output1 = new int[] { 0, 1, 1 };
    int[] output2 = new int[] { 0, 1, 1, 2, 1, 2 };
    CountingBits bits = new CountingBits();
    Assert.assertArrayEquals(bits.countBits(input1), output1);
    Assert.assertArrayEquals(bits.countBits(input2), output2);
  }
}
