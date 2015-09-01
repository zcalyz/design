package com.command;

public class Button {
//	Function function;
	Command command;
	
	String name;

	public Button(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void setCommand(Command command) {
		this.command = command;
	}


	public void onclick(){
		System.out.println(name);
		if(command == null){
			System.out.println("功能键未设置!");
			return;
		}
		command.execute();
	}
	
}
