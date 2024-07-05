import java.util.Arrays;
import java.util.Stack; 
import java.util.Iterator;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5, 9};
		int[] arr2 = {1, 2, 5, 7, 9, 11};
		int[] arr3 = {1, 3, 4, 5, 8, 9};
		System.out.println(Arrays.toString(intersection(arr1, arr2, arr3)));
	}
	
	public static int[] intersection(int[] arr1, int[] arr2, int[] arr3) {
		
		int arrIndex1 = 0, arrIndex2 = 0, arrIndex3 = 0, num = 0;
		
		Stack<Integer> commonStack = new Stack<Integer>(); 
		
		while (arrIndex1 < arr1.length && arrIndex2 < arr2.length && arrIndex3 < arr3.length) {
			
			if (arr1[arrIndex1] == arr2[arrIndex2] && arr1[arrIndex1] == arr3[arrIndex3]) {
				commonStack.add(arr1[arrIndex1++]);
				arrIndex2++;
				arrIndex3++;
				num++;
			}
			else if (arr1[arrIndex1] > arr2[arrIndex2] && arr1[arrIndex1] > arr3[arrIndex3]) {
				arrIndex2++;
				arrIndex3++;
			}
			else if (arr2[arrIndex2] > arr1[arrIndex1] && arr2[arrIndex2] > arr3[arrIndex3]) {
				arrIndex1++;
				arrIndex3++;
			}
			else if (arr3[arrIndex3] > arr1[arrIndex1] && arr3[arrIndex3] > arr2[arrIndex2]) {
				arrIndex1++;
				arrIndex2++;
			}
			else if (arr1[arrIndex1] < arr2[arrIndex2] && arr1[arrIndex1] < arr3[arrIndex3]) {
				arrIndex1++;
			}
			else if (arr2[arrIndex2] < arr1[arrIndex1] && arr2[arrIndex2] < arr3[arrIndex3]) {
				arrIndex2++;
			}
			else arrIndex3++;
		}
		
		Iterator<Integer> values = commonStack.iterator();
		int[] commonNumbers = new int[num];
		int i = 0;
		
		while (values.hasNext()) {
			commonNumbers[i] = values.next();
			i++;
		}
		
		return commonNumbers;
	}

}
