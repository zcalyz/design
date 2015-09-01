package com.command.example;

public class Adder {
	private int num = 0;
	
	public int add(int value){
		num = num + value;
		return num;
	}
	
	public int getNum(){
		return num;
	}
}
