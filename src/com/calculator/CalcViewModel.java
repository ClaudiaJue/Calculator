package com.calculator;

public class CalcViewModel {
    public void onReady() {
        callback.emit(new UiEvents.ReadNumber());
    }

    private Double currentNumber;
    private String operation;

    public void onNumberGiven(Double number) {
        if (operation == null) {
            currentNumber = number;
        } else {
            doCalc(number);
        }
        callback.emit(new UiEvents.ReadOperation());
    }

    private void doCalc(double number) {
        switch (operation) {
            case "+" -> currentNumber += number;
            case "-" -> currentNumber -= number;
            case "*" -> currentNumber *= number;
            case "/" -> currentNumber /= number;
        }
        operation = null;
        callback.emit(new UiEvents.PrintResult(currentNumber));
    }

    public void onOperationIsGiven(String operation) {
        if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
            callback.emit(new UiEvents.NotSupported());
            return;
        }
        this.operation = operation;
        callback.emit(new UiEvents.ReadNumber());
    }

    interface UiEventCallback {
        void emit(UiEvents uiEvent);
    }

    private UiEventCallback callback;

    public void setUiEventCallback(UiEventCallback callback) {
        this.callback = callback;
    }
}
