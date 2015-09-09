package com.command.example2;

public class InsertCommand extends Command{
	
	public InsertCommand() {
		// TODO Auto-generated constructor stub
		this.name = "插入命令";
	}
	
	@Override
	void execute() {
		// TODO Auto-generated method stub
		if(operatorEmpty()){
			return;
		}
		operator.insert(args);
	}

	@Override
	void execute(String args) {
		// TODO Auto-generated method stub
		this.args = args;
		execute();
	}

}
