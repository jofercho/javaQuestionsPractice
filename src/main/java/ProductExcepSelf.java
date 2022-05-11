public class ProductExcepSelf {
    public int[] productExceptSelf(int[] nums){
        int [] solution = new int[nums.length];
        solution[0] = 1;
        int product = 1;
        for(int i =1; i< nums.length; i++){
            solution[i] = nums[i-1] * solution[i-1];
        }


        for (int i = nums.length-1 ; i>=0;i--){
            solution[i]=product * solution[i];
            product = nums[i] * product;
        }

        return solution;
    }
}
