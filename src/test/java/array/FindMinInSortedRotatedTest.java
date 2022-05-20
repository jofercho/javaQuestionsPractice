package array;

import array.FindMinInSortedRotated;
import org.junit.Assert;
import org.junit.Test;

public class FindMinInSortedRotatedTest {

    @Test
    public void findMinInSortedRotatedTest(){
        int[] input1 = new int[]{3,4,5,1,2};
        int[] input2 = new int[]{4,5,6,7,0,1,2};
        int[] input3 = new int[]{11,13,15,17};

        int output1 = 1;
        int output2 = 0;
        int output3 = 11;
        FindMinInSortedRotated min = new FindMinInSortedRotated();
        Assert.assertEquals(min.findMin(input1), output1);
        Assert.assertEquals(min.findMin(input2), output2);
        Assert.assertEquals(min.findMin(input3), output3);
    }
}
