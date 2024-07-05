import java.util.Arrays;

public class SortThoseSquares {

	public static void main(String[] args) {
		int[] nums = {-4, -1, 0, 3, 10};
		System.out.println(Arrays.toString(sortThoseSquares(nums)));
	}
	
	public static int[] sortThoseSquares(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
