package com.knoldus.kup.gradle.operation;

public class Calculator {
    public void add(final int number1, final int number2)
    {
        int addition;
        addition = number1 + number2;
        System.out.println("Addition of given two numbers is " + addition);
    }
    public void subtract(final int number1, final int number2)
    {
        int subtraction;
        subtraction = number1 - number2;
        System.out.println("Subtraction of given two numbers is " + subtraction);
    }
    public void multiply(final int number1, final int number2)
    {
        int multiplication;
        multiplication = number1 * number2;
        System.out.println("Multiplication of given two numbers is " + multiplication);
    }
    public void divide(final int number1, final int number2)
    {
        int division;
        division = number1 / number2;
        System.out.println("Division of given two numbers is " + division);
    }

}
