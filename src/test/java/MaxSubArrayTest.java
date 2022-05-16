import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxSubArrayTest {

    @Test
    public void testMaxSubArray() {
        int[] arr1 = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = new int[]{1};
        int[] arr3 = new int[]{5, 4, -1, 7, 8};
        int[] arr4 = new int[]{-1};
        int[] arr5 = new int[]{-2, 1};
        assertThat(new MaxSubArray().maxSubArray(arr1)).isEqualTo(6);
        assertThat(new MaxSubArray().maxSubArray(arr2)).isEqualTo(1);
        assertThat(new MaxSubArray().maxSubArray(arr3)).isEqualTo(23);
        assertThat(new MaxSubArray().maxSubArray(arr4)).isEqualTo(-1);
        assertThat(new MaxSubArray().maxSubArray(arr5)).isEqualTo(1);
    }
}