public class MaximunProductSubArray {
    public int maxProduct(int[] nums) {
        int solution = nums[0];
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int maxNotUpdated = max;
            max = Math.max(Math.max(maxNotUpdated  * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(maxNotUpdated  * nums[i], min * nums[i]), nums[i]);
            solution = Math.max(max, solution);
        }
        return solution;
    }
}
