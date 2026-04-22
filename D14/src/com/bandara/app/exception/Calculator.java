package com.bandara.app.exception;

import java.util.Scanner;

public class Calculator {
    public static int getAnswer() throws ArithmeticException{
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number :");
        int number1 = input.nextInt();

        System.out.println("Enter a number 2 :");
        int number2 = input.nextInt();


            int add = number1 / number2;
            return add;

    }
}
