package com.knoldus.kup.gradle.main;

import com.knoldus.kup.gradle.operation.Calculator;

import java.util.Scanner;
public class Application {
    public static void main(String... args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Multi Modules Gradle calculator");
        int choice;
        do {
            System.out.println("Select Operation which you want to apply");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println(("5. Exit."));
            System.out.println("===========================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            Calculator calculate = new Calculator();
            if (choice == 1) {
                System.out.println("Enter First Number : ");
                int a = sc.nextInt();
                System.out.println("Value of first number : " + a);
                System.out.println("Enter Second Number : ");
                int b = sc.nextInt();
                System.out.println("Value of second number : " + b);
                calculate.add(a, b);
            }
            else if (choice == 2)
            {
                System.out.println("Enter First Number : ");
                int a = sc.nextInt();
                System.out.println("Value of first number : " + a);
                System.out.println("Enter Second Number : ");
                int b = sc.nextInt();
                System.out.println("Value of second number : " + b);
                calculate.subtract(a, b);
            }
            else if (choice == 3) {
                System.out.println("Enter First Number : ");
                int a = sc.nextInt();
                System.out.println("Value of first number : " + a);
                System.out.println("Enter Second Number : ");
                int b = sc.nextInt();
                System.out.println("Value of second number : " + b);
                calculate.multiply(a, b);
            } else if (choice == 4)
            {
                System.out.println("Enter First Number : ");
                int a = sc.nextInt();
                System.out.println("Value of first number : " + a);
                System.out.println("Enter Second Number : ");
                int b = sc.nextInt();
                System.out.println("Value of second number : " + b);
                calculate.divide(a, b);
            }
            else if(choice == 5)
                break;
            else
            {
                System.out.println("WRONG CHOICE");
            }
        }while(choice !=5);
    }
}
