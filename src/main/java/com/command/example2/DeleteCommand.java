package com.command.example2;

public class DeleteCommand extends Command{
	
	public DeleteCommand() {
		// TODO Auto-generated constructor stub
		this.name = "删除命令";
	}
	
	@Override
	void execute() {
		// TODO Auto-generated method stub
		if(operatorEmpty()){
			return;
		}
		operator.delete(args);
	}

	@Override
	void execute(String args) {
		// TODO Auto-generated method stub
		this.args = args;
		execute();
	}

}
