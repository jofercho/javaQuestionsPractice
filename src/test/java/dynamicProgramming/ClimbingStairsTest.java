package dynamicProgramming;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {
    @Test
    public void climbingStairsTest(){
        int input1 = 2;
        int input2 = 3;
        int output1 = 2;
        int output2 = 3;
        ClimbingStairs stairs = new ClimbingStairs();
        Assert.assertEquals(stairs.climbStairs(input1), output1);
        Assert.assertEquals(stairs.climbStairs(input2), output2);
    }
}
