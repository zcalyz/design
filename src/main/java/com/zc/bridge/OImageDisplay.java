package com.zc.bridge;

import org.springframework.stereotype.Component;

@Component(value="oImageDisplay")
public class OImageDisplay implements ImageDisplay{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("在OS操作系统中显示: ");
	}

}
