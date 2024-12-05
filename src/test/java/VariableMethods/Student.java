package VariableMethods;

import org.testng.annotations.Test;

public class Student {

    public String name; //variabila globala: access control (public), tip variabila (string), nume variabila (name)
    public String lastName;
    public Integer age;
    public String address;
    public Double height;
    public Float weight;
    public Character sex;
    public Boolean hasDiploma;

    @Test
    public void presentingStudent(){
        name = "Andra";
        lastName = "Oniga";
        age = 33;
        address = "good day number 39";
        height = 1.69;
        weight = 52.25f;
        sex = 'F';
        hasDiploma = true;

        System.out.println("My name is " + name + " " + lastName + " and I am " + age + " old." + " I live on " + address + " street." + " I am " + height + " tall and I weight " + weight + " kilograms.");
        System.out.println("Oare am diploma? " + hasDiploma);

        calculateAverage();
    }

    public void calculateAverage(){
        Integer result1 = 8;
        Integer result2 = 7;
        Integer result3 = 10;
        Integer average = (result1 + result2 + result3) / 3;
        System.out.println("The average result is: " + average);

    }
}
