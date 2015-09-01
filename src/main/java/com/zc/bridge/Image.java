package com.zc.bridge;

public abstract class Image {
	
	protected ImageDisplay imageDisplay;
	
	public abstract void parseFile(String filename);

	public void setImageDisplay(ImageDisplay imageDisplay) {
		this.imageDisplay = imageDisplay;
	}
	
	
}
