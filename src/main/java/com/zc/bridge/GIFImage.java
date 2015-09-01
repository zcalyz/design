package com.zc.bridge;

public class GIFImage extends Image{

	@Override
	public void parseFile(String filename) {
		// TODO Auto-generated method stub
		imageDisplay.display();
		System.out.println(filename + "格式为GIF");
	}

}
