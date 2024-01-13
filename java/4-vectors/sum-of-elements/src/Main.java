/* Write a program that asks the user how many elements he wants to insert.
Enter the number of elements and add them all up at the end. Print the result.
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

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += vec[i];
        }

        System.out.println("\nThe sum of the elements is " + sum);

    }
}