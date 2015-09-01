package com.command.example;

public class CalculatorForm {
	private NCommand command;

	public void setCommand(NCommand command) {
		this.command = command;
	}
	
	public void compute(int value){
		if(command == null){
			System.out.println("功能键未设置");
			return;
		}
		int result = command.execute(value);
		System.out.println("计算结果为: " + result);
	
	}
	
	public void undo(){
			int i = command.undo();
			System.out.println("运算结果为：" + i); 	
	}
	
}
