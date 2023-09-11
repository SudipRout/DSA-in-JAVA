public class InsertionSort {
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 2, 4}; //O(n)
        System.out.println("\nAfter sorting the array elements are: ");
        insertionSort(nums);
        printArr(nums);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       //key is the element to be inserted
            int prev = i-1;         //prev is the index of the element before the key
            
            //finding out the position of the key to be inserted
            while (prev >= 0 && arr[prev] > key) {
                arr[prev+1] = arr[prev]; //shift the elements to the right
                prev--;
            }
            //insert the key
            arr[prev+1] = key;
        }   
    }
    public static void printArr(int nums[]) {
	    for (int i = 0; i < nums.length; i++) {
	        System.out.print(nums[i]+" ");
	    }
	    System.out.println();
    }
}