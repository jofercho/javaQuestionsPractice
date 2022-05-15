public class MaximunProductSubArray {
    public int maxProduct(int[] nums) {
        int solution = nums[0];
        int currentMin = nums[0];
        int currentMax = nums[0];
        for (int i = 1; i < nums.length; i++) {

            int tmp = currentMax;
            currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
            currentMin = Math.min(Math.min(tmp * nums[i], currentMin * nums[i]), nums[i]);
            solution = Math.max(solution, currentMax);
        }

        return solution;
    }
}
