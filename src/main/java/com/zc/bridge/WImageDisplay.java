package com.zc.bridge;

import org.springframework.stereotype.Component;

@Component(value="wImageDisplay")
public class WImageDisplay implements ImageDisplay{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("在Windows中显示图像: ");
	}
}
