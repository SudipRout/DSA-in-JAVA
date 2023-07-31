public class CountofanElement {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 10, 10, 10, 10, 12, 14 };
        int key = 10;
        int first = firstOccur(arr, key);
        int last = lastOccur(arr, key);
        int count = (last - first) + 1;
        System.out.println("No. of " + key + " counts are: " + count);
    }

    public static int firstOccur(int arr[], int key) {
        int start = 0, end = arr.length - 1, res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // compare mid & key
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
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
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // compare mid & key
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
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