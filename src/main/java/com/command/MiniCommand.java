package com.command;

public class MiniCommand implements Command{
	
	private Minimize miObj;
	
	public MiniCommand() {
		// TODO Auto-generated constructor stub
		miObj = new Minimize();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		miObj.execute();
	}

}
