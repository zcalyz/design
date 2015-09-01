package com.command;

public class client {
	public static void main(String[] args) {
		Button button1 = new Button("功能键1");
		
		HelpCommand helpCommand = new HelpCommand();
		button1.setCommand(helpCommand);
		button1.onclick();
		
		MiniCommand miniCommand = new MiniCommand();
		button1.setCommand(miniCommand);
		button1.onclick();
//		HelpHandler helpHandler = new HelpHandler();
//		Minimize minimize = new Minimize();
		
//		button1.setFunction(helpHandler);
//		button1.onclick();
//		
//		button1.setFunction(minimize);
//		button1.onclick();
	}
}
