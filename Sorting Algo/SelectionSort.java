public class SelectionSort {
    public static void main(String[] args) {
	    int nums[] = {7, 1, 5, 3, 6, 2, 4}; //O(n)
        System.out.println("After sorting the array elements are: ");
	    selectionSort(nums);
	    printArr(nums);
	}

    public static void selectionSort(int nums[]){
        for (int i = 0; i < nums.length-1; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            //swap
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
	public static void printArr(int nums[]) {
	    for (int i=0; i<nums.length; i++) {
	        System.out.print(nums[i]+" ");
	    }
	    System.out.println();
    }

}