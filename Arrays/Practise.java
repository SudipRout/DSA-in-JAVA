import java.util.*;

public class Practise {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a,b); //Calling the function
        System.out.println("The product of two numbers is: "+ product);
    }
}
