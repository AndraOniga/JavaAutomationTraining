package org.example;

import java.util.Scanner;

public class RepetitionStructuresScanner {

    public void readGrades() {
        System.out.println("Please insert a grade:");
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        while (grade < 1 || grade > 10) {
            System.out.println("Grade must be between 1 and 10. Please insert a valid grade.");
            grade = scanner.nextInt();

        }
        System.out.println("Grate " + grade + " is between 1 and 10");
    }

}
