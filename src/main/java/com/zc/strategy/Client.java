package com.zc.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) 
public class Client {
	@Autowired
	private MovieTicket movieTicket;
	
	@Test
	public void call(){
		movieTicket.setPrice(10);
		System.out.println(movieTicket.getPrice());
	}
}
