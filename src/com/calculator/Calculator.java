package com.calculator;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        startCalculator();
    }

    private static void startCalculator() {
        double firstNum;
        double secondNum;
        String operation;
        double result;
        Scanner scannerInput = new Scanner(System.in);

        //FirstNum
        System.out.println("Type the first number ...");
        firstNum = scannerInput.nextDouble();

        //Operation
        System.out.println("Choose a calculator operation by typing in the symbol: " +
                "\n Addition (+) " +
                "\n Subtraction (-) " +
                "\n Multiplication (*) " +
                "\n Division (/)");
        operation = scannerInput.next();

        //SecondNum
        System.out.println("Type the second number ...");
        secondNum = scannerInput.nextDouble();

        switch (operation) {
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
                System.out.println("Sorry, retry your choice! " +
                        "\n Your input was: " + operation);
                break;
        }
        System.out.println("Do you like to start next Calculation? " +
                "\n Type: Yes (Y) or No (No)");
        String startAgain = scannerInput.next();
        switch (startAgain) {
            case ("Y"):
                startCalculator();
                break;
            case ("N"):
                System.out.println("Bye Bye!");
                break;
        }
    }

    private static Double division(Double firstNum, Double secondNum) {
        Double result = firstNum / secondNum;
        return result;
    }

    private static Double multiplication(Double firstNum, Double secondNum) {
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
