import org.junit.Assert;
import org.junit.Test;

public class TwoSumIITest {
  @Test
  public void twoSumIITest() {
    int[] input1 = new int[] {2, 7, 11, 15};
    int[] input2 = new int[] {2, 3, 4};
    int[] input3 = new int[] {-1, 0};
    int[] input4 =
        new int[] {
          12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180,
          199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368,
          370, 370, 371, 375, 384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506,
          527, 531, 538, 541, 546, 568, 583, 585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755,
          764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 863, 874, 887, 896, 916, 920,
          926, 927, 930, 933, 957, 981, 997
        };
    int target1 = 9;
    int target2 = 6;
    int target3 = -1;
    int target4 = 542;
    int[] output1 = new int[] {1, 2};
    int[] output2 = new int[] {1, 3};
    int[] output3 = new int[] {1, 2};
    int[] output4 = new int[] {24, 32};
    TwoSumII twoSumII = new TwoSumII();
    Assert.assertArrayEquals(output1, twoSumII.twoSum(input1, target1));
    Assert.assertArrayEquals(output2, twoSumII.twoSum(input2, target2));
    Assert.assertArrayEquals(output3, twoSumII.twoSum(input3, target3));
    Assert.assertArrayEquals(output4, twoSumII.twoSum(input4, target4));
  }
}
