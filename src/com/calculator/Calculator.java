package com.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        startCalculator();
    }

    private static void startCalculator() {
        final CalcViewModel viewModel = new CalcViewModel();
        final View view = new View(viewModel);
        viewModel.setUiEventCallback(view);
        viewModel.onReady();

//
//
//        //FirstNum
//
//
//        //Operation
//
//
//        //SecondNum
//        System.out.println("Type the second number ...");
//        secondNum = scannerInput.nextDouble();
    }
}
