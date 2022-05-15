public class MaxSubArray {
    int maxSubArray(int[] nums) {
        int solution = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max < 0){
                max = 0;
            }
            max += nums[i];
            if(solution < max){
                solution = max;
            }
        }
        return solution;
    }
}