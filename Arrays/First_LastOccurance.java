public class First_LastOccurance {
    public static void main(String[] args) {
	    int arr[] = {2, 4, 6, 10, 10, 10, 10, 12, 14};
	    int key = 10;
	    System.out.println("The first occurance of " +key+ " is at index: "+firstOccur(arr, key));
	    System.out.println("The last occurance of " +key+ " is at index: "+lastOccur(arr, key));   
	}
	
	public static int firstOccur(int arr[], int key) {
	    int start = 0, end = arr.length - 1, res = -1;
	    while(start <= end) {
	        int mid = start + (end - start) / 2;
	        //compare mid & key
	        if (arr[mid] < key) {
	            start = mid + 1;
	        }else if (arr[mid] > key) {
	            end = mid - 1;
	        }
	        
	        else {
	            res = mid;
	            end = mid - 1;
	        }
	    }
	    return res;
	}
	
	public static int lastOccur(int arr[], int key) {
	    int start = 0, end = arr.length - 1, res = -1;
	    while(start<=end) {
	        int mid = start + (end-start) / 2;
	        //compare mid & key
	        if (arr[mid] < key) {
	            start = mid + 1;
	        }else if (arr[mid] > key) {
	            end = mid - 1;
	        }
	        
	        else {
	            res = mid;
	            start = mid + 1;
	        }
	    }
	    return res;
	}
}