package com.zc.strategy;

import org.springframework.stereotype.Component;

@Component("StudentDiscount")
public class StudentDiscount implements Discount{

	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		return price*0.8;
	}

}
