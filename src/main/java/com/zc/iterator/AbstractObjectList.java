package com.zc.iterator;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractObjectList {
	List objects = new ArrayList();
	
	public AbstractObjectList(List objects) {
		// TODO Auto-generated constructor stub
		this.objects = objects;
	}
	
	public List getObejects(){
		return objects;
	}
	public abstract AbstractIterator createIterator();
}
