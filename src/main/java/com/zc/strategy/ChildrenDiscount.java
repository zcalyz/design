package com.zc.strategy;

import org.springframework.stereotype.Component;

@Component("ChildrenDiscount")
public class ChildrenDiscount implements Discount{

	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		if(price < 20)
			return price;
		return price - 10;
	}

}
