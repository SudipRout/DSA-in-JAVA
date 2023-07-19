public class MaxSubArraySum3 { //Find the max. subarray using Kadane's Algorithm

    public static void kadanes(int numbers[]) {
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            CurrSum = CurrSum + numbers[i];
            if (CurrSum < 0) {
                CurrSum = 0;
            }
            MaxSum = Math.max(CurrSum, MaxSum);
        }
        System.out.println("Our max subarray sum is: " + MaxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanes(numbers);
    }
}