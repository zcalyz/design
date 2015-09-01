package com.zc.bridge;

public class JPGImage extends Image{

	@Override
	public void parseFile(String filename) {
		// TODO Auto-generated method stub
		imageDisplay.display();
		System.out.println(filename + "图像格式为JPG");
	}

}
