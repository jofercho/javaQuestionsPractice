package array;

import array.ThreeSum;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumTest {
  @Test
  public void threeSumTest() {
    int[] input1 = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> output = new LinkedList<>();
    output.add(Arrays.asList(-1, -1, 2));
    output.add(Arrays.asList(-1, 0, 1));
    ThreeSum threeSum = new ThreeSum();
    List<List<Integer>> solution = threeSum.threeSum(input1);
    System.out.println(output);
    //TODO compare output with solution
  }
}
