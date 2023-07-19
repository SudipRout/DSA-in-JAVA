// package Arrays;

// Find the maximum & minimum element in an array
import java.util.Scanner;

public class MaxMinofArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The largest number is : " + max);
        System.out.println("The smallest number is : " + min);
    }
}
