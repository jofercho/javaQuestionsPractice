package array;

import array.ProductExceptSelf;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf(){
        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{-1,1,0,-3,3};
        int[] output1 = new int[]{24,12,8,6};
        int[] output2 = new int[]{0,0,9,0,0};
      ProductExceptSelf productExceptSelf = new ProductExceptSelf();
      Assert.assertArrayEquals(productExceptSelf.productExceptSelf(nums1), output1);
      Assert.assertArrayEquals(productExceptSelf.productExceptSelf(nums2), output2);
    }
}
