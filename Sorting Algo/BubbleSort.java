public class BubbleSort { //Optimized Bubble Sort

	public static void main(String[] args) {
	    int nums[] = {7, 1, 5, 3, 6, 2, 4}; //O(n)
        System.out.println("After sorting the array elements are: ");
	    bubbleSort(nums);
	    printArr(nums);
	}
	
	public static void bubbleSort(int nums[]) {

        for (int turn = 0; turn < nums.length-1; turn++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length-1-turn; j++) {
                
                if (nums[j] > nums[j+1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            //already sorted
            break;
        }
	}
	
	public static void printArr(int nums[]) {
	    for (int i=0; i<nums.length; i++) {
	        System.out.print(nums[i]+" ");
	    }
	    System.out.println();
    }
}