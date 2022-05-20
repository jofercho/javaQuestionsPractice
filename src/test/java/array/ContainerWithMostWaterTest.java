package array;

import array.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
  @Test
  public void containerWithMostWater() {
    int[] input1 = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int[] input2 = new int[] {1, 1};
    int output1 = 49;
    int output2 = 1;
    ContainerWithMostWater water = new ContainerWithMostWater();
    Assert.assertEquals(water.maxArea(input1), output1);
    Assert.assertEquals(water.maxArea(input2), output2);
  }
}
