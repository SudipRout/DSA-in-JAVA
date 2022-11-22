/* WAP to  take a matrix as input from the user. Search for a given number x and
print the indices at which it occurs */

import java.util.*;

public class TwoDarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns: ");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (numbers[i][j] == x) {
                    System.out.println("x found at location ("+i+","+j+")");
                }
        }
    }
}