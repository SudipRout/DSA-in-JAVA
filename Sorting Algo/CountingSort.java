public class CountingSort {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 2, 4}; //O(n)
        System.out.println("\nAfter sorting the array elements are: ");
        countingSort(nums);
        printArr(nums);
    }
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArr(int nums[]) {
	    for (int i=0; i<nums.length; i++) {
	        System.out.print(nums[i]+" ");
	    }
	    System.out.println();
    }
}