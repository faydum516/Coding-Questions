import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int[] nums = {12, 3, 1, 9, 2, 8, 13, 12, 4, 18, 20, 15, 16};
		int[] nums = {2,7,11,15};
		
		System.out.println(Arrays.toString(twoSum(nums, 9)));
	}
	
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexedNums = new HashMap<Integer, Integer>();
		int[] indexes = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			indexedNums.put(i, nums[i]);
		}
		
		int[] sorted_nums = new int[nums.length];
		
		for (int i = 0; i < sorted_nums.length; i++) {
			sorted_nums[i] = nums[i];
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < sorted_nums.length - i; j++) {
				if (sorted_nums[j - 1] > sorted_nums[j]) {
					int temp = sorted_nums[j - 1];
					sorted_nums[j - 1] = sorted_nums[j];
					sorted_nums[j] = temp;
				}
			}
		}
		
		int left = 0, right = nums.length - 1;
		
		while (left < right) {
			if (sorted_nums[left] + sorted_nums[right] == target) {
                int sumIndex = 0;
				for (int i: indexedNums.keySet()) {
					if (indexedNums.get(i) == sorted_nums[left] || indexedNums.get(i) == sorted_nums[right]) {
						indexes[sumIndex++] = i;
					}
                    if (sumIndex > 2) break;
				}
				return indexes;
			}
			else if (sorted_nums[left] + sorted_nums[right] > target) {
				right--;
			}
			else {
				left++;
			}
		}
		return indexes;
    }
}
