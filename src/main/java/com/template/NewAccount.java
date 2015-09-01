package com.template;

import org.springframework.stereotype.Component;

@Component(value="newAccount")
public class NewAccount extends Account{

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("new ");
	}
	@Override
	public boolean validate(String username){
		return false;
	}
}
