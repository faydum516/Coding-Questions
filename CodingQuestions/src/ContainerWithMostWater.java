public class ContainerWithMostWater {
	
	static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while (left < right) {

            area = Math.max(Math.min(height[left], height[right]) * (right - left), area);

            if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }

        return area;
  	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		
		System.out.print(maxArea(height));	
	}
}
