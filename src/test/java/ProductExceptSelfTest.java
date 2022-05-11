import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductExceptSelfTest {

    @Test
    public void productExceptSelf(){
        int[] nums = new int[]{1,2,3,4,};
        assertThat(new ProductExcepSelf().productExceptSelf(nums)).isNotNull();

    }
}
