package com.command.example2;

public class Client {
	public static void main(String[] args) {
		ConfigSettingWindow csw = new ConfigSettingWindow();
		ConfigOperator operator = new ConfigOperator();
		
		InsertCommand insertCommand = new InsertCommand();
		insertCommand.setOperator(operator);
		csw.setCommand(insertCommand);
		csw.call();
		
		DeleteCommand deleteCommand = new DeleteCommand();
		deleteCommand.setOperator(operator);
		csw.setCommand(deleteCommand);
		csw.call();
		
		InsertCommand insertCommand1 = new InsertCommand();
		insertCommand1.setOperator(operator);
		csw.setCommand(insertCommand1);
		csw.call();
		
		ModifyCommand modifyCommand = new ModifyCommand();
		modifyCommand.setOperator(operator);
		csw.setCommand(modifyCommand);
		csw.call();
		
		System.out.println("----------------------------");  
        System.out.println("保存配置");  
        csw.save();  
              
        System.out.println("----------------------------");   
        System.out.println("恢复配置");  
        System.out.println("----------------------------");   
        csw.recover(); 
		
	}
}
