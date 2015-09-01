package com.command;

public class HelpCommand implements Command{
	
	private HelpHandler helper;
	
	public HelpCommand() {
		// TODO Auto-generated constructor stub
		helper = new HelpHandler();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		helper.execute();
	}

}
