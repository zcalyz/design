package com.command.example2;

import java.util.ArrayList;

public class ConfigSettingWindow {
	private Command command;
	
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public void setCommand(Command command){
		this.command = command;
	}
	public void call(){
		command.execute();
		commands.add(command);
	}
	
	public void save(){
		FileUtil.writeCommands(commands);
	}
	
	public void recover(){
		ArrayList<Command> listCommands = FileUtil.readCommands();
		
		for(Command com : listCommands){
			com.execute();
		}
	}
}
