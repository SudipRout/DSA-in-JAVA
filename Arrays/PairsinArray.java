import java.util.*;
public class PairsinArray {
    public static void printPairs(int numbers[]) {
        int TPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i]; // 2 then 4 then 6 and so on...
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" +current+ "," +numbers[j]+ ") ");
                TPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs = "+TPairs); // TPairs = n(n-1)/2
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}