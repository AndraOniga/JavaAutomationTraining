package Homework;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Exercise 1: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Enter second value: ");
        int secondValue = scanner.nextInt();
        double divisionResult = (double) firstValue/secondValue;
        System.out.println("The sum of " + firstValue + " and " + secondValue + " is: " + (firstValue + secondValue));
        System.out.println("The difference of " + firstValue + " and " + secondValue + " is: " + (firstValue - secondValue));
        System.out.println("The multiplication of " + firstValue + " and " + secondValue + " is: " + (firstValue * secondValue));
        System.out.println("The division of " + firstValue + " and " + secondValue + " is: " + divisionResult);

        System.out.println("\nExercise 2: ");
        
        scanner.close();
    }
}
