public class SearchInsertPosition {
	
	static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middleIndex = -1;

        while (left <= right) {
            middleIndex = (left + right) / 2 ;

            if (nums[middleIndex] == target) {
                return middleIndex;
            }
            else if (nums[middleIndex] > target) {
                right = middleIndex - 1;
            }
            else {
                left = middleIndex + 1;
            }
        }
        
        if (nums[middleIndex] < target) {
            return middleIndex + 1;
        }
        return middleIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3,5,6};
		int[] nums2 = {1,2,3,7,9,12,15};
		int[] nums3 = {21,26,43,57,59,62,65,70};
		System.out.println(searchInsert(nums1, 7));
		System.out.println(searchInsert(nums2, 13));
		System.out.println(searchInsert(nums3, 33));
	}

}