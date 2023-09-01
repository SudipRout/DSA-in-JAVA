import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        Integer nums[] = {7, 1, 5, 3, 6, 2, 4}; //O(n)
        System.out.println("\nAfter sorting the array elements are: ");
        Arrays.sort(nums);
        printArr(nums);
        Arrays.sort(nums, Collections.reverseOrder());
        printArr(nums);   
    }
    public static void printArr(Integer nums[]) {
	    for (int i=0; i<nums.length; i++) {
	        System.out.print(nums[i]+" ");
	    }
	    System.out.println();
    }
}
