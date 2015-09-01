package com.zc.bridge;

import org.springframework.stereotype.Component;

@Component(value="lImageDisplay")
public class 	LImageDisplay implements ImageDisplay{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("在linux中显示图像: ");
	}

}
