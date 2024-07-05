import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(sumNums(nums));
	}
	
	public static List<List<Integer>> sumNums(int[] nums) {
		List<List<Integer>> sumArrs = new ArrayList<List<Integer>>();
		nums = sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int j = i + 1;
				int k = nums.length - 1;
				while (j < k) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> threes = new ArrayList<Integer>();
						threes.add(nums[i]);
						threes.add(nums[j]);
						threes.add(nums[k]);
						sumArrs.add(threes);
						j++;
						k--;
						while(j < k && nums[j] == nums[j - 1]) {
							j++;
						}
						while(j < k && nums[k] == nums[k + 1]) {
							k--;
						}
					}
					else if (nums[i] + nums[j] + nums[k] > 0) {
						k--;
					}
					else {
						j++;
					}
					
				}
			}
		}
		
		return sumArrs;
	}
	
	public static int[] sort(int[] nums) {
		 
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length - i; j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		return nums;
	}
}
