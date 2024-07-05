import java.util.Arrays;

public class TwoSumWithSortedArrays {
	
	static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] indexArr = new int[2];

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                indexArr[0] = left + 1; 
                indexArr[1] = right + 1;
                break;
            }
            else if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return indexArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,7,11,15};
		int target = 9;
		
		System.out.print(Arrays.toString(twoSum(numbers, target)));
	}
}
