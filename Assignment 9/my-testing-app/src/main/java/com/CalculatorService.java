package com.example;

public class CalculatorService {

    private Calculator calculator = new Calculator();

    public int addNumbers(int a, int b) {
        return calculator.add(a, b);
    }
}
