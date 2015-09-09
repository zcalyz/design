package com.command.example2;

import java.io.Serializable;

abstract class Command implements Serializable{
	protected String name;
	
	protected String args;
	
	protected ConfigOperator operator;
	
	abstract void execute();
	
	abstract void execute(String args);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setOperator(ConfigOperator operator) {
		this.operator = operator;
	}
	
	public boolean operatorEmpty(){
		if(operator == null){
			System.out.println("operator is null");
			return true;
		}
		return false;
	}
}
