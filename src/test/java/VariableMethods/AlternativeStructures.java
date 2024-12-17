package VariableMethods;

import org.testng.annotations.Test;

public class AlternativeStructures {

    // structurile alternative= if-then-else; switch-case

    @Test

    public void testMethod() {
        checkNumberBiggerThanFive(8, 5);
        checkNumberBiggerThanFive(3, 8);
        checkNumberBiggerThanFive(8, 8);
        checkOddNumber(5);
        checkOddNumber(4);
        checkOddNumber(-5);
        checkOddNumber(0);
    }

    //verificare numar mai mare decat 5

    public void checkNumberBiggerThanFive(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is bigger than " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " is smaller than " + secondNumber);
        } else {
            System.out.println(firstNumber + " is equal to " + secondNumber);
        }
    }

    //verificare numar par sau impar
    public void checkOddNumber(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is even positive");
            } else {
                System.out.println(number + " is odd positive");
            }
        } else if (number < 0){
            if (number % 2 == 0) {
                System.out.println(number + " is even negative");
            } else {
                System.out.println(number + " is odd negative");
            }
        } else {
            System.out.println(number + " is equal to zero");
        }
    }
}
