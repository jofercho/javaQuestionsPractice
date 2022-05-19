import org.junit.Assert;
import org.junit.Test;

public class MaxProductSubArrayTest {

    @Test
    public void maxProductSubArrayTest(){
        int[] input1 = new int[]{2,3,-2,4};
        int[] input2 = new int[]{-2,0,-1};
        int[] input3 = new int[]{-4,-3,-2};
        int output1 = 6;
        int output2 = 0;
        int output3 = 12;
        MaximunProductSubArray productSubArray = new MaximunProductSubArray();
        Assert.assertEquals(productSubArray.maxProduct(input1), output1);
        Assert.assertEquals(productSubArray.maxProduct(input2), output2);
        Assert.assertEquals(productSubArray.maxProduct(input3), output3);
    }
}
