package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double firstNum;
        double result;
	System.out.println("Choose a calculator operation by typing in the symbol: " +
            "\n Addition (+) " +
            "\n Subtraction (-) " +
            "\n Multiplication (*) " +
            "\n Division (/)");

	Scanner scannerInput = new Scanner(System.in);
	String operation = scannerInput.nextLine();

	System.out.println("Type the first number ...");
	firstNum = scannerInput.nextDouble();

	System.out.println("Type the second number ...");
	Double secondNum = scannerInput.nextDouble();

	switch (operation){
            case "+":
                result = addition(firstNum, secondNum);
                System.out.println(firstNum + " + " + secondNum + " = " + result);
                break;
            case "-":
                result = subtraction(firstNum, secondNum);
                System.out.println(firstNum + " - " + secondNum + " = " + result);
                break;
            case "*":
                result = multiplication(firstNum, secondNum);
                System.out.println(firstNum + " * " + secondNum + " = " + result);
                break;
            case "/":
                result = division(firstNum, secondNum);
                System.out.println(firstNum + " / " + secondNum + " = " + result);
                break;
        default:
            System.out.println("Sorry, retry your choice!");
            break;
        }
    }

    private static Double division(Double firstNum, Double secondNum) {
        Double result = firstNum / secondNum;
        return result;
    }

    private static Double multiplication(Double firstNum,  Double secondNum) {
        Double result = firstNum * secondNum;
        return result;
    }

    private static Double subtraction(Double firstNum, Double secondNum) {
        Double result = firstNum - secondNum;
        return result;
    }

    private static Double addition(Double firstNum, Double secondNum) {
        Double result = firstNum + secondNum;
        return result;
    }
}
