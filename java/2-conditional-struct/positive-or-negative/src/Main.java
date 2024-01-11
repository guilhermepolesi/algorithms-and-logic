import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("\nThe number is positive.");
        }
        else if (number < 0) {
            System.out.println("\nThe number is negative.");
        }
        else {
            System.out.println("\nThe number is equal to zero.");
        }

    }
}