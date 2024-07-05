
public class JumpGame1 {

	public static void main(String[] args) {
		int[] nums1 = {3, 2, 1, 0, 4};
		int[] nums2 = {2, 3, 1, 1, 4};
		System.out.println(canJump(nums1));
		System.out.println(canJump(nums2));
	}
	
	public static boolean canJump(int[] nums) {
		
 		int maxIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] + i > maxIndex) {
				maxIndex = nums[i] + i;
			}
			if (maxIndex == i) break;
		}	 
		
		return maxIndex >= nums.length - 1;
	}
}
