package com.zc.bridge;

public class BMPImage extends Image{

	@Override
	public void parseFile(String filename) {
		// TODO Auto-generated method stub
		imageDisplay.display();
		System.out.println(filename + "格式为BMP");
	}

}
