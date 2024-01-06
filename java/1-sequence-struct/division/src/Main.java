/* Write a program that takes two integers and prints the division between them.
Use float or double for the variable and type conversion for the result.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Instantiating object in java for data entry
        Scanner sc = new Scanner(System.in);

        int n1, n2;
        double div;

        System.out.print("Enter the dividend number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the divisor number: ");
        n2 = sc.nextInt();

        div = (double) n1 / n2;
        System.out.printf("\nDividing %d by %d is %.2f\n", n1, n2, div);

    }
}
