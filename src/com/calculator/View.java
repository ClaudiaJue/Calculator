package com.calculator;

import java.util.Scanner;

public class View implements CalcViewModel.UiEventCallback{
    private final CalcViewModel viewModel;
    private Scanner scannerInput = new Scanner(System.in);

    public View(CalcViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void emit(UiEvents uiEvent) {
        System.out.println("UiEvent: " + uiEvent);
        if(uiEvent instanceof UiEvents.ReadNumber) {
            readNumber();
        }
        if(uiEvent instanceof UiEvents.ReadOperation) {
            readOperation();
        }
        if(uiEvent instanceof UiEvents.PrintResult) {
            System.out.println("Result is " + ((UiEvents.PrintResult)uiEvent).getResult());
        }
    }

    private void readNumber() {
        System.out.println("Type in a number ...");
        Double number = scannerInput.nextDouble();
        viewModel.onNumberGiven(number);
    }

    private void readOperation(){
        System.out.println("Choose a calculator operation by typing in the symbol: " +
                "\n Addition (+) " +
                "\n Subtraction (-) " +
                "\n Multiplication (*) " +
                "\n Division (/)");
        viewModel.onOperationIsGiven(scannerInput.next());
    }
}
