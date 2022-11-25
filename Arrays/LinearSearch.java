// package Arrays;

// Linear Search using Array
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        // input
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to find: ");
        int x = sc.nextInt();

        // output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("The number is found at index: [" +i+ "]");
            }
        }
    }
}
//new comment