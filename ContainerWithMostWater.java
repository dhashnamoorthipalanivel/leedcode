// 11. Container With Most Water
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0; // Initialize max area as minimum value
        while (left < right) {
            // Calculate the area between the two pointers
            int width = right - left;
            int maxVal = Math.min(height[left], height[right]);
            int area = width * maxVal;

            // Update the maximum area if the current area is larger
            if (maxArea < area) {
                maxArea = area;
            }

            // Move the pointer on the smaller height

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
