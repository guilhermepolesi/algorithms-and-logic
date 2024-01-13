/*
Write a program that asks the user the number of values to insert into vectors A and B.
Insert the values into the two vectors and then add them and print the values and their respective positions.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for vectors A and B: ");
        int n = sc.nextInt();

        int[] vecA = new int[n];
        System.out.println("\nEnter the values of vector A:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            vecA[i] = number;
        }

        int[] vecB = new int[n];
        System.out.println("\nEnter the values of vector B:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            vecB[i] = number;
        }

        int[] sumVec = new int[n];
        for (int i = 0; i < n; i++) {
            sumVec[i] = vecA[i] + vecB[i];
        }

        System.out.println("\nThe position and sum of the values is:");
        for (int i = 0; i < n; i++) {
            System.out.println("Position " + i + " = " + sumVec[i]);
        }

    }
}