package array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreeSumTest {
  @Test
  public void threeSumTest() {
    int[] input1 = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> output = new LinkedList<>();
    output.add(Arrays.asList(-1, -1, 2));
    output.add(Arrays.asList(-1, 0, 1));
    int[] input2 = new int[] {};
    List<List<Integer>> output2 = new LinkedList<>();

    ThreeSum threeSum = new ThreeSum();
    List<List<Integer>> solution1 = threeSum.threeSum(input1);
    List<List<Integer>> solution2 = threeSum.threeSum(input2);
    AtomicInteger iterator = new AtomicInteger();
    solution1.forEach(
        integers -> Assert.assertEquals(integers, output.get(iterator.getAndIncrement())));
    iterator.set(0);
    solution2.forEach(
        integers -> Assert.assertEquals(integers, output2.get(iterator.getAndIncrement())));
  }
}
