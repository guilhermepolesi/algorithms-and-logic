/*
Write a program that directly assigns variables. Assign the main types (string, integer, character, floating-point and logical.
Enter your name, age, gender and height.
The logical value is determined false if the age is less than 40, and true for greater than 40.
Print the information.
*/

// Class that will contain the main method to run a Java program
public class Main { // Opening the "{" key indicates that everything that comes after it is within the Main class

    // main() method to execute a program in Java
    public static void main(String[] args) { // //Opening the key "{" indicates that everything that comes after it is within the main() method

        // Strings in Java are declared as objects of the String class
        String name = "Alan";

        // Declaration of integers in Java
        int age = 41;

        // Character declaration in Java
        char gender = 'M';

        // Double precision floating point declaration. The "float" type is used for single precision
        double height = 1.82;

        // Logical value declaration
        boolean logical = true;

        /* Screen printing method, using the “+” operator with strings to concatenate variables in their respective positions.
        The "\n" is used to jump to the line below.
        */
        System.out.println("Name: " + name
                           + "\nAge: " + age
                           + "\nGender: " + gender
                           + "\nHeight: " + height
                           + "\nLogical value: " + logical);

    } // Closing this brace "}" indicates the end of the main() method
} // Closing this brace "}" indicates the end of the class