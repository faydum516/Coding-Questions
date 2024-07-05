import java.util.Arrays;

public class StuffThemCandies {

	public static void main(String[] args) {
		int[] nums1 = {2, 3, 5, 1, 3};
		System.out.println(Arrays.toString(maxOrNot(nums1, 3)));
	}
	
	public static int[] maxOrNot(int[] arr, int extra_candies) {
		
		int maxCandies = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxCandies) maxCandies = arr[i];
		}
		
		int[] maxCandiesOrNot = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] + extra_candies >= maxCandies) maxCandiesOrNot[i] = 1;
			else maxCandiesOrNot[i] = 0;
		}
		
		return maxCandiesOrNot;
	}
}
