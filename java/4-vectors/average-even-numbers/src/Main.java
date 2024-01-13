/*
Write a program that asks the user how many elements he wants to insert.
Enter the numbers and check the average of the even numbers and the number of even numbers in the vector.
Print the values.
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

        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (vec[i] % 2 == 0) {
                sum += vec[i];
                count++;
            }
        }

        if (count != 0) {
            double average = (double) sum / count;
            System.out.printf("\nThe average of the even numbers in the vector is %.2f"
                    + " and the number of even numbers is %d", average, count);
        }
        else {
            System.out.println("\nThere are no even numbers in the vector");
        }

    }
}