package array;

//Given a non-empty array, return true if there is a place to split the array so that
//the sum of the numbers on one side is equal to the sum of the numbers on the other side.

//Examples

//    method([9, 7, 1, 1]) → true
//    method([7, 5, 2, 10, 4]) → true
//    method([1, 1, 1, 2, 1]) → true
//    method([10,9]) → false
//    method([8, 3, 1, 20]) → false


public class CanBalance {

    public boolean canBalance(int[] nums){
        if(nums.length < 2)
            return false;
        int pointerA = 0;
        int pointerB = nums.length - 1;
        int sumA = nums[pointerA];
        int sumB = nums[pointerB];
        while (true){
            if(pointerA == pointerB - 1){
                return sumA == sumB;
            }
            if(sumA >= sumB){
                pointerB--;
                sumB += nums[pointerB];
            }else {
                pointerA++;
                sumA += nums[pointerA];
            }
        }
    }
}
