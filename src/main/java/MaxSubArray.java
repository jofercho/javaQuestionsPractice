public class MaxSubArray {
    int maxSubArray(int[]nums){
        int sum = nums[0];
        if(nums.length == 1) return nums[0];
        int max = Math.max(nums[0], 0);
        for(int i=1; i < nums.length; i++){
            if(sum<0){
                sum = 0;
            }
            sum = sum + nums[i];
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
}

//[-2,1,-3,4,-1,2,1,-5,4]