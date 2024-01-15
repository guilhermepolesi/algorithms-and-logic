/*
Write a program that creates a 4x4 matrix, and asks the user to enter numbers.
Print the values that are above the main diagonal.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[4][4];

        System.out.println("Enter matrix numbers:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int number = sc.nextInt();
                mat[i][j] = number;
            }
        }

        System.out.println("\nAbove main diagonal:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    System.out.print(mat[i][j] + "    ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        
    }
}