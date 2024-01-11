/* Write a program that prompts the user to enter three integers. Prints the largest and smallest.
If the three numbers entered are the same, the message "The numbers entered are all the same!" will be printed.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, largest = 0, smallest = 0;

        System.out.println("Enter three numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 == n2 && n1 == n3) {
            System.out.println("\nThe numbers entered are all the same!");
        }
        else if (n1 > n2 && n1 > n3) {
            largest = n1;
            if (n2 < n3) {
                smallest = n2;
            }
            else {
                smallest = n3;
            }
        }
        else if (n2 > n3) {
            largest = n2;
            if (n1 < n3) {
                smallest = n1;
            }
            else {
                smallest = n3;
            }
        }
        else {
            largest = n3;
            if (n1 < n2) {
                smallest = n1;
            }
            else {
                smallest = n2;
            }
        }

        if (largest != 0 || smallest != 0) {
            System.out.println("\nThe largest number is " + largest + " and the smallest number is " + smallest);
        }
    }
}