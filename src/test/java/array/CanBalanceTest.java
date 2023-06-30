package array;

import org.junit.Assert;
import org.junit.Test;

public class CanBalanceTest {

  @Test
  public void canBalanceTest() {

    int[] test1 = new int[] {9, 7, 1, 1};
    int[] test2 = new int[] {7, 5, 2, 10, 4};
    int[] test3 = new int[] {1, 1, 1, 2, 1};
    int[] test4 = new int[] {10, 9};
    int[] test5 = new int[] {8, 3, 1, 20};

    boolean result1 = true;
    boolean result2 = true;
    boolean result3 = true;
    boolean result4 = false;
    boolean result5 = false;
    CanBalance canBalance = new CanBalance();
    Assert.assertEquals(result1, canBalance.canBalance(test1));
    Assert.assertEquals(result2, canBalance.canBalance(test2));
    Assert.assertEquals(result3, canBalance.canBalance(test3));
    Assert.assertEquals(result4, canBalance.canBalance(test4));
    Assert.assertEquals(result5, canBalance.canBalance(test5));
  }
}
