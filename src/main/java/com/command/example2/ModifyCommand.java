package com.command.example2;

public class ModifyCommand extends Command{
	
	public ModifyCommand() {
		// TODO Auto-generated constructor stub
		this.name = "修改命令";
	}
	
	@Override
	void execute() {
		// TODO Auto-generated method stub
			if(operatorEmpty()){
				return;
			}
			operator.modify(args);
	}

	@Override
	void execute(String args) {
		// TODO Auto-generated method stub
		this.args = args;
		execute();
	}

}
