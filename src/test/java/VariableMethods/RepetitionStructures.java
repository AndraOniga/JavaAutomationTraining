package VariableMethods;

import org.testng.annotations.Test;

public class RepetitionStructures {

    @Test
    public void testMethod(){
        printValuesWhile();
        printValuesDoWhile();
        printValueFor();
    }


    public void printValuesWhile() {
        int value = 1;
        while(value <= 5){
            System.out.println("Value is: " + value);
            value ++;
        }
        System.out.println("Value after while execution is: " + value);
    }

    public void printValuesDoWhile() {
        int value = 6;
        do{
            System.out.println("Value is " + value);
            value ++;
        }while(value <=5);
        System.out.println("Value after do while execution is: " + value);
    }

    public void printValueFor() {
        //declarare si initializare contor, conditie care trebuie verificata, schimbare care urmeaza (incrementare in cazul curent)
        // conditia e obligatoriu de pus in for
        for(int value = 1; value <=5; value ++) {
            System.out.println("Value after for execution is: " + value);
        }
    }
}
