package com.zc.strategy;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MovieTicket {
	private double price;
	@Resource(name="ChildrenDiscount")
	private Discount discount;


	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public double getPrice(){
		return discount.calculate(price);
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
}
