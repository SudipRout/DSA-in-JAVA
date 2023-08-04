public class Order_AgnosticSearch {
    public static void main(String[] args) {
        int nums[] = { 14, 12, 10, 8, 6, 4, 2 };
        int key = 2;
        System.out.println("Index for key is: " + binarySearch(nums, key));
    }

    public static int binarySearch(int nums[], int key) {
        int start = 0, end = nums.length - 1;
        boolean isAsc = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == key) {
                return mid;
            }

            // Ascending Order
            if (isAsc == true) {
                if (nums[mid] < key) // key is in right half
                    start = mid + 1;
                else                 // key is in left half
                    end = mid - 1;
            }

            // Descending order
            else {
                if (nums[mid] > key) // key is in right half
                    start = mid + 1;
                else                // key is in left half
                    end = mid - 1;
            }
        }
        return -1; // Element is not present
    }
}