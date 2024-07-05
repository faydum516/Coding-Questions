
public class GoodPairing {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 1, 1, 3, 3};
		System.out.println(numOfPairs(arr1));
	}
	
	public static int numOfPairs(int[] arr) {
		
		int numPairs = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) numPairs++;
			}
		}
		
		return numPairs;
	}
}
