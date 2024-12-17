package VariableMethods;

import org.testng.annotations.Test;

import java.util.Date;

public class Car {
    public String type;
    public String model;
    public Integer year;


    @Test
    public void testMethod (){

        carData("Mini", "Cooper",2024);
        carData("Fiat", "Panda", 2022);

        averageCalculation(2.94, 3.52);
        averageCalculation(10.58, 12.45);

    }


    public void carData (String carType, String carModel, Integer carYear){
        type = carType;
        model = carModel;
        year = carYear;

        System.out.println("The car's type is: " + type + " and model: " + model + " from year " + year);
    }


    //calcularea mediei a doua numere
    public void averageCalculation (Double firstNumber, Double secondNumber){

        Double result = (firstNumber +secondNumber)/2;

        System.out.println("The average of the two numbers is: " + result);

    }

}
