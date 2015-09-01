package com.template;

import org.springframework.stereotype.Component;

@Component(value="savingAccount")
public class SavingAccount extends Account{

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("按定期计算利息");
	}

}
