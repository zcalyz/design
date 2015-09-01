package com.template;

public abstract class Account {
	
	public boolean validate(String username){
		System.out.println("User: " + username);
		
		if (username.equals("zc")) {
			return true;
		}else{
			return false;
		}
	}
	
	public abstract void calculateInterest();
	
	public void display(){
		System.out.println("显示利息");
	}
	
	public void templateMethod(String username){
		if(!validate(username)){
			System.out.println("账户名错误!");
			return;
		}
		
		calculateInterest();
		
		display();
		
	}
}
