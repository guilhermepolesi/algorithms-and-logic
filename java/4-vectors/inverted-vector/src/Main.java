/* Write a program that asks the user how many elements they want to insert.
Enter the number of elements and print them in reverse order.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert: ");
        int n = sc.nextInt();

        int[] vec = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter a number: ");
            int number = sc.nextInt();
            vec[i] = number;
        }

        System.out.println("\nReverse order:");
        for (int i = n-1; i >= 0; i--) {
            System.out.println(vec[i]);
        }

    }
}