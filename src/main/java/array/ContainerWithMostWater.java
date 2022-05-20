package array;

public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int maxArea = 0;
        int left =  0;
        int right = height.length - 1;
        int maxHeight;
        while (left < right){
            maxHeight = Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, maxHeight * (right - left));
            if(height[left]>height[right]){
                right--;
            }else {
                left++;
            }
        }

        return maxArea;
    }
}
