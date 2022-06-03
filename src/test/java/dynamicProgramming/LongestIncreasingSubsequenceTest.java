package dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {
  @Test
  public void longestIncreasingSubsequenceTest() {
    int[] input1 = new int[] {1, 2, 4, 3};
    int[] input2 = new int[] {10,9,2,5,3,7,101,18};
    int[] input3 = new int[] {0,1,0,3,2,3};
    int[] input4 = new int[] {7,7,7,7,7,7,7};
    int[] input5 = new int[] {10,9,2,5,3,7,101,18};
    int output1 = 3;
    int output2 = 4;
    int output3 = 4;
    int output4 = 1;
    int output5 = 4;
    LongestIncreasingSubsequence subsequence = new LongestIncreasingSubsequence();
    Assert.assertEquals(subsequence.lengthOfLIS(input1), output1);
    Assert.assertEquals(subsequence.lengthOfLIS(input2), output2);
    Assert.assertEquals(subsequence.lengthOfLIS(input3), output3);
    Assert.assertEquals(subsequence.lengthOfLIS(input4), output4);
    Assert.assertEquals(subsequence.lengthOfLIS(input5), output5);
  }
}
