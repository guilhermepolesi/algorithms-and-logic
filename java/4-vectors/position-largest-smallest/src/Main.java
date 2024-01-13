// Write a program to insert values ​​into a vector. Print the largest, smallest and their respective positions.

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

        int largest = vec[0], posLargest = 0;
        for (int i = 1; i < n; i++) {
            if (vec[i] > largest) {
                largest = vec[i];
                posLargest = i;
            }
        }

        int smallest = vec[0], posSmallest = 0;
        for (int i = 1; i < n; i++) {
            if (vec[i] < smallest) {
                smallest = vec[i];
                posSmallest = i;
            }
        }

        System.out.println("\nThe largest number inserted in the vector is " + largest
                           + " and is in position " + posLargest
                           + "\nThe smallest number inserted in the vector is " + smallest
                           + " and is in position " + posSmallest);
    }
}