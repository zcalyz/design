package com.zc.strategy;

import org.springframework.stereotype.Component;

@Component("VIPDiscount")
public class VIPDiscount implements Discount{

	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		return price*0.5;
	}

}
