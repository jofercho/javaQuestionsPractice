package array;

import array.TwoSum;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTest {

    @Test
    public void testTwoSum(){
        int target1 = 6;
        int target2 = 9;
        int target3 = 6;
        int target4 = 9;
        int[] values1 = new int[]{3,2,4};
        int[] values2 = new int[]{2,7,11,15};
        int[] values3 = new int[]{3,3};
        int[] values4 = new int[]{2,7,11,15};
        int[] solution1 = new TwoSum().twoSum(values1, target1);
        int[] solution2 = new TwoSum().twoSum(values2, target2);
        int[] solution3 = new TwoSum().twoSum(values3, target3);
        int[] solution4 = new TwoSum().twoSum(values4, target4);
        assertThat(values1[solution1[0]]+values1[solution1[1]]).isEqualTo(target1);
        assertThat(values2[solution2[0]]+values2[solution2[1]]).isEqualTo(target2);
        assertThat(values3[solution3[0]]+values3[solution3[1]]).isEqualTo(target3);
        assertThat(values4[solution4[0]]+values4[solution4[1]]).isEqualTo(target4);
    }
}
