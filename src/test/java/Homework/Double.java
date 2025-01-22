package Homework;

import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        System.out.println("Exercise 1: Calculate the Volume of a Cylinder");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius value: ");
        double radius = scanner.nextInt();
        System.out.print("Enter height value: ");
        double height = scanner.nextInt();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("The volume of the cylinder is: %.2f\n", volume); //%- beginning of a format specifier, .2- round to 2 decimal, f- floating point number

        System.out.println("\nExercise 2: Convert Fahrenheit to Celsius");
        System.out.println("\nExercise 2: Convert Fahrenheit to Celsius");
        System.out.print("Enter Fahrenheit value: ");
        double fahrenheit = scanner.nextInt();
        double celsius = ((fahrenheit - 32) * 5) / 9;
        System.out.println(fahrenheit + " degrees means " + String.format("%.2f", celsius) + " degrees Celsius");

        System.out.println("\nExercise 3: Calculate the Hypotenuse of a Right-Angled Triangle");
        System.out.println("Enter the the length of one side: ");
        double firstSide = scanner.nextInt();
        System.out.println("Enter the length of the other side: ");
        double secondSide = scanner.nextInt();
        double hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        System.out.println("The ypotenuse of a right- angled triangle with one side of " + firstSide + " and the other side of " + secondSide + " is " + String.format("%.2f", hypotenuse));
        scanner.close();
    }
}
