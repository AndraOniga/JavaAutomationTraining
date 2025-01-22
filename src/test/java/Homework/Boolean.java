package Homework;

import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Boolean Value Assignment and Printing");
        boolean skyIsBlue = true;
        System.out.println("is the sky blue? " + skyIsBlue);

        System.out.println("\nExercise 2: Boolean Comparison");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextInt();
        boolean isGreater = firstNumber > secondNumber;
        boolean isSmaller = firstNumber < secondNumber;
        boolean isEqual = firstNumber == secondNumber;
        System.out.println(firstNumber + " is greater than " + secondNumber + " " + isGreater);
        System.out.println(firstNumber + " is less than " + secondNumber +  " " + isSmaller);
        System.out.println(firstNumber + " is equal to " + secondNumber +  " " + isEqual);

        System.out.println("\nExercise 3: Checking Weather Conditions");

        scanner.close();
    }
}
