package com.template;

import org.springframework.stereotype.Component;

@Component(value="currentAccount")
public class CurrentAccount extends Account{

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("按活期计算利息");
	}

}
