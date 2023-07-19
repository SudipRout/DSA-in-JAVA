public class SubArray {
    public static void printSubArrays(int numbers[]){
        int TSubArrays = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" "); //print subarray
                }
                TSubArrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = "+TSubArrays);
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}