public class SearchinRotatedSortedArray {
    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int mid = start + (end-start)/2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {                     // if left half of array is sorted
                if (nums[start] <= target && nums[mid] >= target) { // check if target lies between start & mid
                    end = mid - 1;                              // update end
                } else {                                        // check if target lies between mid & end
                    start = mid + 1;                            // update start
                }
            } else {                                            // if right half of array is sorted
                if (nums[end] >= target && nums[mid] <= target) { // check if target lies between mid & end
                    start = mid + 1;                            // update start
                } else {                                        // check if target lies between start & mid
                    end = mid - 1;                              // update end
                }
            }
        }
        return -1;
    }
}