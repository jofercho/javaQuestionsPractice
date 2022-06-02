package dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class CoinChangeTest {
  @Test
  public void coinChangeTest() {
    int[] input1 = new int[] {1, 3, 4, 5};
    int[] input2 = new int[] {1, 2, 5};
    int[] input3 = new int[] {2};
    int[] input4 = new int[] {1};
    int[] input5 = new int[] {2, 5, 10, 1};
    int amount1 = 7;
    int amount2 = 11;
    int amount3 = 3;
    int amount4 = 0;
    int amount5 = 27;
    int output1 = 2;
    int output2 = 3;
    int output3 = -1;
    int output4 = 0;
    int output5 = 4;
    CoinChange change = new CoinChange();
    Assert.assertEquals(change.coinChange(input1, amount1), output1);
    Assert.assertEquals(change.coinChange(input2, amount2), output2);
    Assert.assertEquals(change.coinChange(input3, amount3), output3);
    Assert.assertEquals(change.coinChange(input4, amount4), output4);
    Assert.assertEquals(change.coinChange(input5, amount5), output5);
  }
}
