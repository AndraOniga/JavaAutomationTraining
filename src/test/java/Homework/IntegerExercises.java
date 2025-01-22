package Homework;

import java.util.Scanner;

public class IntegerExercises {

    public static void main(String[] args) {
        System.out.println("Exercise 1: Calculate the Perimeter of a Rectangle");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length value: ");
        int length = scanner.nextInt();
        System.out.print("Enter width value: ");
        int width = scanner.nextInt();
        System.out.println("The perimeter of the rectangle is: "+ 2 * (length + width));

        System.out.println("\nExercise 2: Convert Minutes into Seconds");
        System.out.println("Enter number of minutes you want to convert into seconds: ");
        int minutes = scanner.nextInt();
        System.out.println(minutes + " minutes is " + minutes * 60 + " seconds");

        System.out.println("\nExercise 3: Calculate the Area of a Square");
        System.out.println("Enter the side value: ");
        int side = scanner.nextInt();
        int area = (int) Math.pow(side, 2);
        System.out.println("The area of a square with side of " + side + " is " + area);

        scanner.close();

    }
}