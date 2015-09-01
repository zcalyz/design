package com.command.example;

import java.util.ArrayList;
import java.util.Stack;

import com.command.Command;

public class AdderCommand implements NCommand{
	
	private Adder adder;
	
	private Stack<Integer> valueStack;
	
	public AdderCommand() {
		// TODO Auto-generated constructor stub
		adder = new Adder();
		valueStack = new Stack<Integer>();
	}
	@Override
	public int execute(int value) {
		// TODO Auto-generated method stub
		valueStack.add(value);
		return adder.add(value);
	}
	
	public int undo(){
		if(!valueStack.empty()){
			return adder.add(-valueStack.pop());
		}
		System.out.println("已无其它操作可撤销");
		return adder.getNum();
	}
}
