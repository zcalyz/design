package com.command.example;

public class Client {
	public static void main(String[] args) {
		CalculatorForm calculatorForm = new CalculatorForm();
		AdderCommand adderCommand = new AdderCommand();
		
		calculatorForm.setCommand(adderCommand);
		
		calculatorForm.compute(10);
		calculatorForm.compute(20);
		
		calculatorForm.undo();
		calculatorForm.undo();
		calculatorForm.undo();
	}
}
