
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 6, 7};
		int[] arr2 = {4, 1, 2};
		System.out.println(findTheMissingNum(arr1, 7));
		System.out.println(findTheMissingNum(arr2, 4));
	}
	
	public static int findTheMissingNum(int[] nums, int length) {
		int cumulativeSum = length * (length + 1) / 2;
		int sum = 0;
		for (int i = 0; i < nums.length; sum += nums[i], i++);
		return cumulativeSum - sum;
	}
}
