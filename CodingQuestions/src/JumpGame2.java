
public class JumpGame2 {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(jump(nums));
	}
	
	public static int jump(int[] nums) {
		
		int jumps = 0;
        int currentEnd = 0;
        int maxIndex = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + i > maxIndex) maxIndex = nums[i] + i;
            if (currentEnd == i) {
                currentEnd = maxIndex;
                jumps++;
            }
        }

        return jumps;
	}

}
